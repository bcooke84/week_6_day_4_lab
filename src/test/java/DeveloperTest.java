import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Fraser", "JL000000A", 30000);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2.5);
        assertEquals(30750 , developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(300, developer.payBonus(), 0.01);
    }
}
