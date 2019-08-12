package ac.za.cput.project.domaine.demography;

public class EmployeeRace {

    private String employeeNumber;
    private String race;


    public EmployeeRace(EmployeeRace.Builder build){
        this.employeeNumber = build.employeeNumber;
        this.race = build.race;
    }


    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getRace() {
        return race;
    }

    public static class Builder{

        private String employeeNumber;
        private String race;

        public Builder employeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder race(String race){
            this.race = race;
            return this;
        }

        public EmployeeRace build(){
            return new EmployeeRace(this);
        }
    }

    @Override
    public String toString() {
        return "EmployeeRace{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
