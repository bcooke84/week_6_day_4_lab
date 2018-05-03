import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Nikhil", "JN000000K", 100000, "Accounts", 1000000);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2.5);
        assertEquals(102500, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(2000, director.payBonus(), 0.01);
    }
}
