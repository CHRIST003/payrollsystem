package ac.za.cput.project.repository.demography;

import ac.za.cput.project.domaine.demography.Race;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String>{

    Set<Race> getAll();

}
