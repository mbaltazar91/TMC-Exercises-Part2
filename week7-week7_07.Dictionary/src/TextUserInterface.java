import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dict;

    public TextUserInterface(Scanner reader,Dictionary dict){
        this.reader = reader;
        this.dict = dict;
    }

    public void start(){
        System.out.println("Statements: ");
        System.out.println("add - adds a word pair to dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quits the text user interface\n");

        while(true) {
            System.out.print("Statement: ");
            String choice = reader.next();

            if (choice.equals("add")) {
                System.out.print("In Finnish: ");
                String word1 = reader.next();
                System.out.print("\nTranslation: ");
                String word2 = reader.next();
                dict.add(word1, word2);
            }

            if(choice.equals("translate")){
                System.out.print("Give a word: ");
                String word = reader.next();
                System.out.println("Translation: " + dict.translate(word));
            }

            if(choice.equals("quit")){
                System.out.println("Cheers!");
                break;
            }
        }

    }
}
/**
 Statements:
 add - adds a word pair to the dictionary
 translate - asks a word and prints its translation
 quit - quits the text user interface

 Statement: add
 In Finnish: porkkana
 Translation: carrot

 Statement: translate
 Give a word: porkkana
 Translation: carrot

 Statement: quit
 Cheers!

 **/