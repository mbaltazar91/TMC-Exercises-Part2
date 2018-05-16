package reference.domain;

public class Film {

    private String name;

    public Film(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return getName();
    }

    @Override
    public int hashCode(){
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
}
