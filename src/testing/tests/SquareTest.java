package testing.tests;

import areas.shapes.Square;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ngondo on 5/30/16.
 */
public class SquareTest {

    @Test
    public void testAreas() throws Exception {
        Square s = new Square();
        int area = s.areas(6);
        assertEquals(36, area, 0);
    }
}