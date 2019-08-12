package ac.za.cput.project.repository.demography.impl;

import ac.za.cput.project.domaine.demography.EmployeeRace;
import ac.za.cput.project.repository.demography.EmployeeRaceRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository{

    public static EmployeeRaceRepositoryImpl repository;
    private Set<EmployeeRace> employeeRaces;

    private EmployeeRaceRepositoryImpl() {
        this.employeeRaces = new HashSet<>();
    }

    private EmployeeRace findEmployeeRace(String employeeNumber) {
        return this.employeeRaces.stream()
                .filter(employeeRace -> employeeRace.getEmployeeNumber().trim().equals(employeeNumber))
                .findAny()
                .orElse(null);
    }

    public static EmployeeRaceRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeRaceRepositoryImpl();
        return repository;
    }


    @Override
    public Set<EmployeeRace> getAll() {
        return employeeRaces;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        if(read(employeeRace.getEmployeeNumber()) == null){
            employeeRaces.add(employeeRace);
        }
        return employeeRace;
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        if(read(employeeRace.getEmployeeNumber()) != null){
            delete(employeeRace.getEmployeeNumber());
            create(employeeRace);
        }
        return employeeRace;
    }

    @Override
    public void delete(String s) {

        EmployeeRace employeeRace = read(s);
        this.employeeRaces.remove(employeeRace);

    }

    @Override
    public EmployeeRace read(final String employeeNumber) {
        EmployeeRace employeeRace = findEmployeeRace(employeeNumber);
        return employeeRace;
    }
}
