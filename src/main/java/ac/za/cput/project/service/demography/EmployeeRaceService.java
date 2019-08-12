package ac.za.cput.project.service.demography;

import ac.za.cput.project.domaine.demography.EmployeeRace;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<EmployeeRace, String> {

    Set<EmployeeRace> getAll();
}
