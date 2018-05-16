
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public int hashCode(){
        return latinName.hashCode() + ringingYear;
    }

    @Override
    public boolean equals(Object bird){
        return this.hashCode()==bird.hashCode();
    }
}


