import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Dictionary dict = new Dictionary();
      Scanner reader = new Scanner(System.in);

      TextUserInterface ui = new TextUserInterface(reader,dict);
      ui.start();
    }
    }

