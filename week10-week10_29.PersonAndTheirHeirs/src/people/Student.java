package people;

public class Student extends Person {

    private int credits;

    public Student(String name, String address){
        super(name,address);
        credits = 0;
    }

    public void study(){
        credits += 1;
    }

    public int credits(){
        return credits;
    }

    @Override
    public String toString(){
        String person = String.format("%s\n  credits %s",super.toString(),credits);
        return person;
    }
}
