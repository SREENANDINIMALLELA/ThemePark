package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(17,199,500);
        visitor1 = new Visitor(14,200,200);
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
    public void checkCriteria() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void checkCriteriaTest() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }
    @Test
    public void checkTicketPriceTest() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor),0.1);
    }
    @Test
    public void checkTicketPriceForTallTest() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor1),0.1);
    }
}
