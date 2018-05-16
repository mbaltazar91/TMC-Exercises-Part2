package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {

    private int count;

    public PersonalCalculator(){
        count = 0;
    }

    public void increase(){
        count += 1;
    }

    public int giveValue(){
        return count;
    }
}
