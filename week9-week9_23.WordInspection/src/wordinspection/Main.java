package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) {


        File file = new File("src/shortList.txt");
        WordInspection w = new WordInspection(file);
        System.out.println(w.palindromes());
        System.out.println(w.wordsContainingZ());
        System.out.println(w.wordsWhichContainAllVowels());
        System.out.println(w.wordsEndingInL());

    }
}
