package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor1;
    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(17,162,500);
        visitor1 = new Visitor(14,162,200);
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
    public void checkAgeCriteria() {
        assertEquals(true, playground.isAllowedTo(visitor));
    }
    @Test
    public void checkUnderAgeCriteria() {
        assertEquals(false, playground.isAllowedTo(visitor1));
    }


}
