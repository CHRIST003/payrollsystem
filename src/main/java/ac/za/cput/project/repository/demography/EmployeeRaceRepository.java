package ac.za.cput.project.repository.demography;

import ac.za.cput.project.domaine.demography.EmployeeRace;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends IRepository<EmployeeRace,String> {

    Set<EmployeeRace> getAll();
}
