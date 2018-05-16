package reference.domain;

public class Person {

    private String name;

    public Person(String name){
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
        return(this.hashCode()==o.hashCode());
    }
}
