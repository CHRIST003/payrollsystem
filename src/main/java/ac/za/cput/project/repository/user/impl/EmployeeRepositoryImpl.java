package ac.za.cput.project.repository.user.impl;

import ac.za.cput.project.domaine.user.Employee;
import ac.za.cput.project.repository.user.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> employees;

    private EmployeeRepositoryImpl() {
        this.employees = new HashMap<>();
    }

    public static EmployeeRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Employee> getAll() {
        Collection<Employee> employees = this.employees.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public Employee create(Employee employee) {
        if(read(employee.getEmployeeNumber())  == null){
            this.employees.put(employee.getEmployeeNumber(),employee);
        }
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        if(read(employee.getEmployeeNumber()) != null){
            employees.replace(employee.getEmployeeNumber(), employee);
        }
        return employee;
    }

    @Override
    public void delete(String s) {
        Employee employee = read(s);
        this.employees.remove(s, employee);
    }

    @Override
    public Employee read(String s) {
        return this.employees.get(s);
    }
}

