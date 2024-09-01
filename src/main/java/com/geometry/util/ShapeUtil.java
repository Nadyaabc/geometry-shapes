package main.java.com.geometry.util;

import main.java.com.geometry.model.Circle;
import main.java.com.geometry.model.Rectangle;
import main.java.com.geometry.model.Shape;
import main.java.com.geometry.model.Square;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ShapeUtil {
    private final Random random = new Random();
    public Circle createRandomCircle(){
        Double radius =random.nextDouble(10);
        return new Circle("A random circle", radius);
    }
    public Square createRandomSquare(){
        Double side = random.nextDouble(10);
        return new Square("A random square", side);
    }
    public Rectangle createRandomRectangle(){
        Double sideA = random.nextDouble(10);
        Double sideB = random.nextDouble(10);
        return new Rectangle(sideA, sideB, "A random rectangle");
    }

    public Shape createRandomShape(){
        int shapeNumber = random.nextInt(3);
        switch(shapeNumber){
            case 0: return createRandomCircle();
            case 1: return createRandomSquare();
            case 2: return createRandomRectangle();
            default:
                System.out.println("Shape number " + shapeNumber);
        }
        return null;
    }
    public Double calculateArea(Shape[] shapes){
        double result=0;
        for (Shape shape:shapes){
            result+=shape.countArea();
        }
        return result;
    }
    public Double calculatePerimeter(Shape[] shapes){
        double result=0;
        for (Shape shape:shapes){
            result+=shape.countPerimeter();
        }
        return result;
    }

    public double calculateArea(Shape shape){
        return shape.countArea();
    }
    public double calculatePerimeter(Shape shape){
        return shape.countPerimeter();
    }
    public List<Shape> findEquals(List<Shape> allShapes, Shape shapeToCompare){
        return allShapes.stream()
                .filter(shape -> shape.equals(shapeToCompare))
                .collect(Collectors.toList());
    }

}
