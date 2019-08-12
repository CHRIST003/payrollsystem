package ac.za.cput.project.domaine.user;

import ac.za.cput.project.domaine.demography.EmployeeGender;
import ac.za.cput.project.domaine.demography.EmployeeRace;

import java.util.Objects;

public class Employee {

    private String employeeNumber;
    private String firstname;
    private String lastname;
    private EmployeeGender employeeGender;
    private EmployeeRace employeeRace;


    private Employee(Employee employee) {
    }

    private Employee(Builder build){

        this.employeeNumber = build.employeeNumber;
        this.firstname = build.firstname;
        this.lastname = build.lastname;
        this.employeeGender = build.employeeGender;
        this.employeeRace = build.employeeRace;

    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public EmployeeGender getEmployeeGender() {
        return employeeGender;
    }

    public EmployeeRace getEmployeeRace() {
        return employeeRace;
    }

    public static class Builder{

        private String employeeNumber;
        private String firstname;
        private String lastname;
        private EmployeeGender employeeGender;
        private EmployeeRace employeeRace;

        public Builder employeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder firstname(String firstname){
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public Builder gender (EmployeeGender employeeGender){
            this.employeeGender = employeeGender;
            return this;
        }

        public Builder race (EmployeeRace employeeRace){
            this.employeeRace = employeeRace;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

    } //end of builder



//   public Builder copy(Employee employee){
//        this.employeeNumber = employeeNumber;
//        this.firstname = firstname;
//        this.lastname = lastname;
//
//       return this;
//   }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                "EmployeeGender= "+ employeeGender.getGender()+
                "EmployeeRace= "+ employeeRace.getRace()+
                ", employeeGender=" + employeeGender +
                ", employeeRace=" + employeeRace +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeNumber.equals(employee.employeeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber);
    }
}

