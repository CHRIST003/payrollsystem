package ac.za.cput.project.repository.user;

import ac.za.cput.project.domaine.user.Employee;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee,String > {

    Set<Employee> getAll();
}
