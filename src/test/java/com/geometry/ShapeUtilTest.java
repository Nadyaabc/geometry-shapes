package test.java.com.geometry;

import main.java.com.geometry.model.Circle;
import main.java.com.geometry.model.Rectangle;
import main.java.com.geometry.model.Shape;
import main.java.com.geometry.model.Square;
import main.java.com.geometry.util.ShapeUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class ShapeUtilTest {

    private final ShapeUtil shapeUtil = new ShapeUtil();
    @Test
    public void shouldCalculatePerimeter(){
        Shape[]shapes = new Shape[]{
                new Circle("A", 4.0),
                new Square("B", 1.0),
                new Rectangle( 2.0, 3.0,"C")
        };
        assertEquals(shapeUtil.calculatePerimeter(shapes),39.132741228 , 0.01);
    }
    @Test
    public void shouldCalculateArea() {
        Shape[] shapes = {
                new Circle("A", 4.0),
                new Square("B", 1.0),
                new Rectangle( 2.0, 3.0,"C")
        };
        var area = shapeUtil.calculateArea(shapes);
        assertEquals(57.2654824, area, 0.001);
    }
    @Test
    public void testComparison(){
        List<Shape> list = List.of(
                new Rectangle(1.0, 2.0, "A"),
                new Rectangle(1.0, 2.0, "B"),
                new Rectangle(3.0, 2.0, "A"),
                new Rectangle(1.0, 3.0, "A"),
                new Rectangle(1.0, 2.0, "A"),
                new Square("B", 1.0),
                new Circle("A", 1.0));
        Shape rectangle = new Rectangle(1.0, 3.0, "A");
        List<Shape> actualList = shapeUtil.findEquals(list, rectangle);
        assertEquals(1, actualList.size());
    }
}
