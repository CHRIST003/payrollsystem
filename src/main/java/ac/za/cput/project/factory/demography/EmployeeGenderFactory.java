package ac.za.cput.project.factory.demography;

import ac.za.cput.project.domaine.demography.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String employeeNumber, String gender){
        return new EmployeeGender.Builder()
                .employeeNumber(employeeNumber)
                .gender(gender)
                .build();
    }
}
