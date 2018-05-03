import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Brian", "JB000000X", 25000, "Support");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2.5);
        assertEquals(25625 ,manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, manager.payBonus(), 0.01);
    }

}
