package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor_1;
    Visitor visitor_2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor_1 = new Visitor(11, 140, 10 );
        visitor_2 = new Visitor(13, 201, 10);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void priceFor__Under12(){assertEquals(2.25, dodgems.priceFor(visitor_1), 0.1);}

    @Test
    public void priceFor__Over12(){assertEquals(4.50, dodgems.priceFor(visitor_2), 0.1);}
}
