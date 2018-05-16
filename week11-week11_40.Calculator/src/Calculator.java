public class Calculator {

    private int value;

    public Calculator(){
        value = 0;
    }

    public void add(int num){
        value += num;
    }

    public void subtract(int num){
        value -= num;
    }

    public void reset(){
        value = 0;
    }

    public int getValue(){
        return value;
    }
}
