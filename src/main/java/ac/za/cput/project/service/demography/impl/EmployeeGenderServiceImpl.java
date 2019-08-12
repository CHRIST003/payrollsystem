package ac.za.cput.project.service.demography.impl;

import ac.za.cput.project.domaine.demography.EmployeeGender;
import ac.za.cput.project.repository.demography.EmployeeGenderRepository;
import ac.za.cput.project.repository.demography.impl.EmployeeGenderRepositoryImpl;
import ac.za.cput.project.service.demography.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    private EmployeeGenderServiceImpl(){this.repository = EmployeeGenderRepositoryImpl.getRepository();}

    public static EmployeeGenderServiceImpl getService(){if(service == null){service = new EmployeeGenderServiceImpl();}
        return service;
    }


    @Override
    public Set<EmployeeGender> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.repository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.repository.update(employeeGender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.repository.read(s);
    }
}
