package main.java.com.geometry.io;

import main.java.com.geometry.model.Shape;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ShapeXML {
    public void saveShapesToXML(Shape[] shapes, String filename){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element rootElement = document.createElement("shapes");
            document.appendChild(rootElement);

            for (Shape shape : shapes){
                Element shapeElement = document.createElement(shape.getClass().getSimpleName().toLowerCase());
                rootElement.appendChild(shapeElement);

                Attr attribute1 = document.createAttribute("title");
                attribute1.setValue(shape.getTitle());
                shapeElement.setAttributeNode(attribute1);

                Attr attribute0 = document.createAttribute("measurements");
                attribute0.setValue(shape.getMeasurements());
                shapeElement.setAttributeNode(attribute0);

                Attr attribute2 = document.createAttribute("area");
                attribute2.setValue(shape.countArea().toString());
                shapeElement.setAttributeNode(attribute2);

                Attr attribute3 = document.createAttribute("perimeter");
                attribute3.setValue(shape.countPerimeter().toString());
                shapeElement.setAttributeNode(attribute3);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(filename));
            transformer.transform(domSource, streamResult);
            System.out.println("Геометрические фигуры сохранены в " + filename);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
