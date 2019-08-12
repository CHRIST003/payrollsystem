package ac.za.cput.project.service.demography;

import ac.za.cput.project.domaine.demography.EmployeeGender;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {

    Set<EmployeeGender>getAll();
}
