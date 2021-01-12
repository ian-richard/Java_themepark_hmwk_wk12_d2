package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor_1;
    Visitor visitor_2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor_1 = new Visitor(14, 140, 10 );
        visitor_2 = new Visitor(16, 160, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isAllowedToEnter(){ assertTrue(playground.isAllowedTo(visitor_1));}

    @Test
    public void isNotAllowedToEnter(){ assertFalse(playground.isAllowedTo(visitor_2));}
}
