package ac.za.cput.project.factory.demography;

import ac.za.cput.project.domaine.demography.EmployeeRace;

public class EmployeeRaceFactory {

    public static EmployeeRace buildEmployeeRace(String employeeNumber, String race){
        return new EmployeeRace.Builder()
                .employeeNumber(employeeNumber)
                .race(race)
                .build();
    }
}
