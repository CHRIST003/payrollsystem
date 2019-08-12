package ac.za.cput.project.factory.user;

import ac.za.cput.project.domaine.demography.EmployeeGender;
import ac.za.cput.project.domaine.demography.EmployeeRace;
import ac.za.cput.project.domaine.user.Employee;
import ac.za.cput.project.factory.demography.EmployeeGenderFactory;
import ac.za.cput.project.factory.demography.EmployeeRaceFactory;

import static ac.za.cput.project.util.Amr.generateId;

public class EmployeeFactory {

    public static Employee buildEmployee(String employeeNumber, String firstname, String lastname, String gender, String race){

        EmployeeGender employeeGenderBuild = EmployeeGenderFactory.buildEmployeeGender(employeeNumber, gender);
        EmployeeRace employeeRaceBuild = EmployeeRaceFactory.buildEmployeeRace(employeeNumber, race);

      return new Employee.Builder().employeeNumber(generateId())
              .employeeNumber(employeeNumber)
              .firstname(firstname)
              .lastname(lastname)
              .gender(employeeGenderBuild)
              .race(employeeRaceBuild)
              .build();
    }
}
