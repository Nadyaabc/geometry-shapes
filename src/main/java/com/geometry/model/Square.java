package main.java.com.geometry.model;

import java.util.Objects;

public class Square extends Shape {

    private final Double side;
    private final String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Objects.equals(side, square.side) && Objects.equals(title, square.title);
    }

    @Override
    public String getMeasurements() {
        return side.toString();
    }


    public Square(String title, Double side ) {
        this.side = side;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public Double countArea() {
        return side*side;
    }

    @Override
    public Double countPerimeter() {
        return side*4;
    }
}
