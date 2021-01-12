package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor_1;
    Visitor visitor_2;
    Visitor visitor_3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor_1 = new Visitor(11, 140, 10 );
        visitor_2 = new Visitor(11, 201, 10);
        visitor_3 = new Visitor(16, 160, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToEnter(){ assertTrue(rollerCoaster.isAllowedTo(visitor_3));}

    @Test
    public void isNotAllowedToEnter_height(){ assertFalse(rollerCoaster.isAllowedTo(visitor_2));}

    @Test
    public void isNotAllowedToEnter_age_height(){ assertFalse(rollerCoaster.isAllowedTo(visitor_1));}

    @Test
    public void hasDefaultPrice(){assertEquals(8.40, rollerCoaster.defaultPrice(), 0.1);}

    @Test
    public void priceForTall(){assertEquals(16.8, rollerCoaster.priceFor(visitor_2), 0.1);}

    @Test
    public void priceFor__NotTall(){assertEquals(8.40, rollerCoaster.priceFor(visitor_1), 0.1);}
}
