package ac.za.cput.project.domaine.demography;

public class EmployeeGender {

    private String employeeNumber;
    private String gender;

    public EmployeeGender(EmployeeGender.Builder build){

        this.employeeNumber = build.employeeNumber;
        this.gender = build.gender;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getGender() {
        return gender;
    }

    public static class Builder{

        private String employeeNumber;
        private String gender;

        public Builder employeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }

        public EmployeeGender build(){
            return new EmployeeGender(this);
        }
    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
