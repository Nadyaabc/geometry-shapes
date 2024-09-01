package test.java.com.geometry;

import main.java.com.geometry.model.Square;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void shouldCalculateArea(){
        Square square = new Square("a Square", 1.0);
        Assert.assertEquals(square.countArea(), 1.0, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter(){
        Square square = new Square("a Square", 1.0);
        Assert.assertEquals(square.countPerimeter(), 4.0,0.01);
    }
}
