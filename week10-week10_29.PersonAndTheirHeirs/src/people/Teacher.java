package people;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String address, int salary){
        super(name,address);
        this.salary = salary;
    }

    @Override
    public String toString(){
        String person = String.format("%s\n  salary %s euros/month",super.toString(),salary);
        return person;
    }
}
