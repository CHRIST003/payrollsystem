package ac.za.cput.project.service.demography;

import ac.za.cput.project.domaine.demography.Gender;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {

    Set<Gender> getAll();
}
