package ac.za.cput.project.service.demography.impl;

import ac.za.cput.project.domaine.demography.Race;
import ac.za.cput.project.repository.demography.RaceRepository;
import ac.za.cput.project.repository.demography.impl.RaceRepositoryImpl;
import ac.za.cput.project.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private static RaceServiceImpl service = null;
    private RaceRepository repository;

    private RaceServiceImpl(){this.repository = RaceRepositoryImpl.getRepository();}

    public static RaceServiceImpl getService() {
        if (service == null) {
            service = new RaceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Race create(Race employeeRace) {
        return this.repository.create(employeeRace);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }
}
