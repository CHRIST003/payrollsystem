package ac.za.cput.project.repository.demography.impl;

import ac.za.cput.project.domaine.demography.EmployeeGender;
import ac.za.cput.project.repository.demography.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {

    public static EmployeeGenderRepositoryImpl repository;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepositoryImpl() {
        this.employeeGenders = new HashSet<>();
    }

    public static EmployeeGenderRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return employeeGenders;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        if(read(employeeGender.getEmployeeNumber()) == null){
            employeeGenders.add(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        if(read(employeeGender.getEmployeeNumber()) != null){
            delete(employeeGender.getEmployeeNumber());
            create(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public void delete(String s) {
        EmployeeGender employeeGender = read(s);
        this.employeeGenders.remove(employeeGender);
    }

    @Override
    public EmployeeGender read(String s) {
        return employeeGenders.stream()
                .filter(employeeGender -> s.equalsIgnoreCase(employeeGender.getEmployeeNumber()))
                .findAny()
                .orElse(null);
    }
}
