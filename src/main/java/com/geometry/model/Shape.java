package main.java.com.geometry.model;

import java.util.Objects;

public abstract class Shape {
    private final String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(title, shape.title);
    }

    Shape(String shape){
        this.title = shape;
    }
    Shape(){
        this.title = "NO SHAPE";
    }

    public String getTitle() {
        return title;
    }
    abstract public String getMeasurements();

    abstract public Double countArea();

    abstract public Double countPerimeter();
}
