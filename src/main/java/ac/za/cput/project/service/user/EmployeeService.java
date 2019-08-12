package ac.za.cput.project.service.user;

import ac.za.cput.project.domaine.user.Employee;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {

   Set<Employee> getAll();
}
