import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Employee("Andrew", "JX000000J", 20000);
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(2.5);
        assertEquals(20500, employee.getSalary(),0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, employee.payBonus(), 0.01);
    }

    @Test
    public void cantEnterNegativeRaise(){
        employee.raiseSalary(-100);
        assertEquals(20000, employee.getSalary(), 0.01);
    }

    @Test
    public void cantEnterNullName(){
        employee.setName(null);
        assertEquals("Andrew", employee.getName());
    }

    @Test
    public void cantEnterEmptyString(){
        employee.setName("");
        assertEquals("Andrew", employee.getName());
    }

}
