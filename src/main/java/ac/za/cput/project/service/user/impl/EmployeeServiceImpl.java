package ac.za.cput.project.service.user.impl;

import ac.za.cput.project.domaine.user.Employee;
import ac.za.cput.project.repository.user.EmployeeRepository;
import ac.za.cput.project.repository.user.impl.EmployeeRepositoryImpl;
import ac.za.cput.project.service.user.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){this.repository = EmployeeRepositoryImpl.getRepository();}

    public static EmployeeServiceImpl getService(){
        if(service == null){service = new EmployeeServiceImpl();}
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }
}
