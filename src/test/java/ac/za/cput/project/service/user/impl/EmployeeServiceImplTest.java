package ac.za.cput.project.service.user.impl;

import ac.za.cput.project.domaine.user.Employee;
import ac.za.cput.project.factory.user.EmployeeFactory;
import ac.za.cput.project.service.user.EmployeeService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    EmployeeService service;
    Employee employee;



    @Before
    public void setUp() throws Exception {

        service = EmployeeServiceImpl.getService();
        employee = EmployeeFactory.buildEmployee("217025358"
                , "Christ"
                , "Nganga"
                , "Male"
                ,"Black");
    }

    @Test
    public void getService() {

        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {

        service.create(employee);
        assertNotNull(service.read("217025358"));
        System.out.println("An employee has been created: " + service.read("217025358"));
    }

    @Test
    public void update() {

        service.create(employee);                                                                                                //Because value gets deleted
        System.out.println(service.read("217025358"));

        Employee employeeUpdated = EmployeeFactory.buildEmployee("217025358", "John", "Salumu", "other","white");
        service.update(employeeUpdated);
        Employee em = service.read("217025358");
        assertNotEquals(employee.getFirstname(), em.getLastname());
        System.out.println("Updated\n"+service.read("217025358"));
    }

    @Test
    public void delete() {

        service.delete("213058553");
        assertNull(service.read(employee.getEmployeeNumber()));
        System.out.println("Delete\n"+service.read(employee.getEmployeeNumber()));
    }

    @Test
    public void read() {
        assertNotNull(service.read("217025358"));
        System.out.println("Reading an employee: "+ service.read("217025358"));
    }
}