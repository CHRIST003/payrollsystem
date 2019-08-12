package ac.za.cput.project.repository.demography;

import ac.za.cput.project.domaine.demography.Gender;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {

    Set<Gender> getAll();
}
