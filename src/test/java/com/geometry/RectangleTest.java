package test.java.com.geometry;

import main.java.com.geometry.model.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void shouldCalculateArea(){
        Rectangle rectangle = new Rectangle(1.0, 1.0, "a Rectangle");
        assertEquals(rectangle.countArea(), 1.0, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter(){
        Rectangle rectangle = new Rectangle(1.0, 1.0,"a Rectangle");
        assertEquals(rectangle.countPerimeter(), 4.0,0.01);
    }
}