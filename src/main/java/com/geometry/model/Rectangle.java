package main.java.com.geometry.model;

import java.util.Objects;

public class Rectangle extends Shape {
    private final Double sideA;
    private final Double sideB;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sideA, rectangle.sideA) && Objects.equals(sideB, rectangle.sideB) && Objects.equals(title, rectangle.title);
    }

    @Override
    public String getMeasurements() {
        return sideA + " " + sideB;
    }


    private final String title;

    public Rectangle(Double sideA, Double sideB, String title) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public Double countArea() {
        return sideA*sideB;
    }

    @Override
    public Double countPerimeter() {
        return 2*(sideA+sideB);
    }
}
