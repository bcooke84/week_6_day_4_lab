import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import javax.xml.crypto.Data;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;

    @Before
    public void before(){
        databaseadmin = new DatabaseAdmin("Ally", "KB000000Y", 50000);
    }

    @Test
    public void canRaiseSalary(){
        databaseadmin.raiseSalary(2.5);
        assertEquals(51250 , databaseadmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(500, databaseadmin.payBonus(), 0.01);
    }

}
