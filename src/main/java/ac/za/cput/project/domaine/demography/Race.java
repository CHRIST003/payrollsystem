package ac.za.cput.project.domaine.demography;

import java.util.Objects;

public class Race {

    private String racerId;
    private String raceDesc;

    private Race() {
    }

    private Race (Builder builder){
        this.racerId = builder.racerId;
        this.raceDesc = builder.raceDesc;
    }

    public String getRacerId() {
        return racerId;
    }

    public String getRaceDesc() {
        return raceDesc;
    }

    public static class Builder{

        private String racerId;
        private String raceDesc;

        public Builder racerId(String racerId){

            this.racerId = racerId;
            return this;
        }

        public Builder raceDesc(String raceDesc){

            this.raceDesc = raceDesc;
            return this;
        }

        public Race build(){
            return new Race(this);
        }


        public Builder copy(Race race){
            this.racerId = race.racerId;
            this.raceDesc = race.raceDesc;

            return this;
        }

    }//end Builder




    @Override
    public String toString() {
        return "Race{" +
                "racerId='" + racerId + '\'' +
                ", raceDesc='" + raceDesc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return racerId.equals(race.racerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racerId);
    }
}


