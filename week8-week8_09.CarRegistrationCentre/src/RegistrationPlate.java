
public class RegistrationPlate {

    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public int hashCode(){
        return regCode.hashCode()+country.hashCode();
    }

    @Override
    public boolean equals(Object object){
        if(object.hashCode()==this.hashCode()){
            return true;
        }
        return false;
    }

}
