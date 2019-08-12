package ac.za.cput.project.service.demography;

import ac.za.cput.project.domaine.demography.Race;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, String> {

    Set<Race>getAll();
}
