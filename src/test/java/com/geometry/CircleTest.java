package test.java.com.geometry;

import main.java.com.geometry.model.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CircleTest {
    @Test
    public void shouldCalculateArea(){
        Circle circle = new Circle("a circle", 1.0);
        assertEquals(circle.countArea(), 3.14, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter(){
        Circle circle = new Circle("a circle", 1.0);
        assertEquals(circle.countPerimeter(), 6.28,0.01);
    }


}
