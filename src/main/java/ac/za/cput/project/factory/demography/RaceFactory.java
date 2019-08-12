package ac.za.cput.project.factory.demography;

import ac.za.cput.project.domaine.demography.Race;
import ac.za.cput.project.util.Amr;

public class RaceFactory {

    public static Race getRace(String raceId, String raceDesc){

        return new Race.Builder().racerId(Amr.generateId())
                .racerId(raceId)
                .raceDesc(raceDesc)
                .build();
    }
}
