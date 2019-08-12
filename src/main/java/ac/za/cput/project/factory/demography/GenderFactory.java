package ac.za.cput.project.factory.demography;

import ac.za.cput.project.domaine.demography.Gender;
import ac.za.cput.project.util.Amr;

public class GenderFactory {

    public static Gender getGender(String genderId, String genderDesc){
        return new Gender.Builder().genderId(Amr.generateId())
                .genderId(genderId)
                .genderDesc(genderDesc)
                .build();
    }
}
