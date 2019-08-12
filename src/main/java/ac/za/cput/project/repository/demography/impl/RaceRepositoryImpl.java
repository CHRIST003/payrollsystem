package ac.za.cput.project.repository.demography.impl;

import ac.za.cput.project.domaine.demography.Race;
import ac.za.cput.project.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    public static RaceRepositoryImpl repository ;
    private Set<Race> races;

    private RaceRepositoryImpl(){
        this.races = new HashSet<>();
    }


    public static RaceRepositoryImpl getRepository(){

        if(repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Race> getAll() {
        return this.races;
    }

    @Override
    public Race create(Race employeeRace) {
        if(read(employeeRace.getRacerId()) == null){
            races.add(employeeRace);
        }
        return employeeRace;
    }

    @Override
    public Race update(Race employeeRace) {
        if(read(employeeRace.getRacerId()) != null){
            delete(employeeRace.getRacerId());
            create(employeeRace);
        }
        return employeeRace;
    }

    @Override
    public void delete(String s){
        Race race = read(s);
        this.races.remove(race);
    }

    @Override
    public Race read(final String s) {
        return races.stream()
                .filter(race -> s.equalsIgnoreCase(race.getRacerId()))
                .findAny()
                .orElse(null);
    }
}
