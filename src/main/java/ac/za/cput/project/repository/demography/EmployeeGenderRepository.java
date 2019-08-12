package ac.za.cput.project.repository.demography;

import ac.za.cput.project.domaine.demography.EmployeeGender;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {

    Set<EmployeeGender>getAll();
}
