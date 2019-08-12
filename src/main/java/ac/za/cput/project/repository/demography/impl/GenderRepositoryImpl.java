package ac.za.cput.project.repository.demography.impl;

import ac.za.cput.project.domaine.demography.Gender;
import ac.za.cput.project.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    public static GenderRepositoryImpl repository ;
    private Set<Gender> genders;

    private GenderRepositoryImpl(){
        this.genders = new HashSet<>();
    }

    public static GenderRepositoryImpl getRepository(){

        if(repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Gender> getAll() {
        return genders;
    }

    @Override
    public Gender create(Gender employeeGender) {
        if(read(employeeGender.getGenderId()) == null){
            genders.add(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public Gender update(Gender employeeGender) {
        if(read(employeeGender.getGenderId()) != null){
            delete(employeeGender.getGenderId());
            create(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public void delete(String s) {

        Gender gender = read(s);
        this.genders.remove(gender);

    }

    @Override
    public Gender read(String s) {
        return genders.stream()
                .filter(gender -> s.equalsIgnoreCase(gender.getGenderId()))
                .findAny()
                .orElse(null);
    }
}
