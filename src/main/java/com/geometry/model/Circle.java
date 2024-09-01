package main.java.com.geometry.model;

import main.java.com.geometry.model.Shape;

import java.util.Objects;

public class Circle extends Shape {
    private final Double radius;
    private final String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius) && Objects.equals(title, circle.title);
    }

    @Override
    public String getMeasurements() {
        return radius.toString();
    }
    public String getTitle() {
        return title;
    }
    public Circle(String title, Double radius){
        this.radius = radius;
        this.title = title;
    }

    @Override
    public Double countArea() {
        return (Math.pow(radius, 2)*Math.PI);
    }

    @Override
    public Double countPerimeter() {
        return 2*Math.PI*radius;
    }
}
