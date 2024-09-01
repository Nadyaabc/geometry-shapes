package main.java.com.geometry;
import main.java.com.geometry.io.ShapeXML;
import main.java.com.geometry.model.Circle;
import main.java.com.geometry.model.Rectangle;
import main.java.com.geometry.model.Shape;
import main.java.com.geometry.model.Square;
import main.java.com.geometry.util.ShapeUtil;

public class Main {
    public static void main(String[] args) {
        ShapeXML shapeXML = new ShapeXML();
        ShapeUtil shapeUtil = new ShapeUtil();

        Circle circle = shapeUtil.createRandomCircle();
        Square square = shapeUtil.createRandomSquare();
        Rectangle rectangle = shapeUtil.createRandomRectangle();
        double circleArea = circle.countArea(); // Расчет площади круга
        double circlePerimeter = circle.countPerimeter(); // Расчет периметра круга

        double rectangleArea = rectangle.countArea(); // Расчет площади прямоугольника
        double rectanglePerimeter = rectangle.countPerimeter(); // Расчет периметра прямоугольника

        double squareArea = square.countArea(); // Расчет площади квадрата
        double squarePerimeter = square.countPerimeter(); // Расчет периметра квадрата
        Shape[] shapes = {circle, square, rectangle};
        shapeXML.saveShapesToXML(shapes, "shapes.xml");

    }
}