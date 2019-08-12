package ac.za.cput.project.domaine.demography;

import java.util.Objects;

public class Gender {

    private String genderId;
    private String genderDesc;

    private Gender() {
    }

    private Gender (Builder builder){
        this.genderId = builder.genderId;
        this.genderDesc = builder.genderDesc;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getGenderDesc() {
        return genderDesc;
    }

    public static class Builder{

        private String genderId;
        private String genderDesc;

    public Builder genderId(String genderId){

       this.genderId = genderId;
       return this;
    }

    public Builder genderDesc(String genderDesc){

        this.genderDesc = genderDesc;
        return this;
      }

        public Gender build(){
            return new Gender(this);
        }


    }//end Builder

//    public Builder copy(Gender gender){
//        this.genderId = gender.genderId;
//        this.genderDesc = gender.genderDesc;
//
//        return this;
//    }


    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", genderDesc='" + genderDesc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return genderId.equals(gender.genderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genderId);
    }
}


