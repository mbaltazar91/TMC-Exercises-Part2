public class Calculator {

    private Reader reader;
    private int count = 0;

    public Calculator(){
        reader = new Reader();
        //count = 0;
    }

    private void sum(){
        System.out.println("Value1: ");
        int value1 = reader.readInteger();
        System.out.println("Value2: ");
        int value2 = reader.readInteger();

        int sum = value1+value2;
        System.out.println("sum of the values " + sum);
        count++;
    }

    private void difference(){
        System.out.println("Value1: ");
        int value1 = reader.readInteger();
        System.out.println("Value2: ");
        int value2 = reader.readInteger();

        int sum = value1-value2;
        System.out.println("difference of the values " + sum);
        count++;
    }

    private void product(){
        System.out.println("Value1: ");
        int value1 = reader.readInteger();
        System.out.println("Value2: ");
        int value2 = reader.readInteger();

        int sum = value1*value2;
        System.out.println("product of the values " + sum);
        count++;
    }

    private void statistics(){
        System.out.println("Calculations done " + count);
    }



    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
            }
            else if (command.equals("difference")) {
                difference();
            }
            else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

}
