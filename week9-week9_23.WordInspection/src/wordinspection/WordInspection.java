package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;
    private List<String> words;

    public WordInspection(File file){
        this.file = file;
        this.words = new ArrayList<String>();
        readFile();
    }

    public void readFile() {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                words.add(line);
            }
        } catch (Exception e) {
            System.out.println("Not found");
        }
    }

    public int wordCount(){
        return words.size();
    }

    public List<String> wordsContainingZ(){
        List<String> list = new ArrayList<String>();
        for(String word : words){
            if(word.contains("z")){
                list.add(word);
            }
        }
        return list;
    }

    public List<String> wordsEndingInL(){
        List<String> list = new ArrayList<String>();
        for(String word : words){
            if(word.length()>0&&word.charAt(word.length()-1)=='l'){
                list.add(word);
            }
        }
        return list;
    }

    public List<String> palindromes(){
        List<String> list = new ArrayList<String>();
        for(String word : words){
            String reverse = "";
            for(int i = word.length()-1;i>=0;i--){
                reverse+=word.charAt(i);
            }
            if(reverse.equals(word)){
                list.add(word);
            }
        }
        return list;
    }

    public List<String> wordsWhichContainAllVowels(){
        List<String> list = new ArrayList<String>();
        char[] vowels = {'a','e','i','o','u','y','ä','ö'};
        for(String word : words){
            boolean allVowels = true;
            for(char c : vowels){
                if(!word.contains(c+"")){
                    allVowels = false;
                    break;
                }
        }
        if(allVowels){
                list.add(word);
        }
        }
        return list;
    }
}
