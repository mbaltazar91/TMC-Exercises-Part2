package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class MindfulDictionary {

    private Map<String,String> dictionary;
    private String file;


    public MindfulDictionary(){
        dictionary = new HashMap<String,String>();
    }

    public MindfulDictionary(String file){
        dictionary = new HashMap<String,String>();
        this.file = file;
    }

    public void add(String word, String translation) {
        if (!dictionary.keySet().contains(word)) {
            dictionary.put(word, translation);
        }
    }

    public String translate(String word){
        for (String entry : dictionary.keySet()) {
                if (entry.equals(word)) {
                    return dictionary.get(word);
                }
                if (dictionary.get(entry).equals(word)) {
                    return entry;
                }
            }
        return null;
    }

    public void remove(String word){
        List<String> toRemove = new ArrayList<String>();
        for(String entry : dictionary.keySet()){
            if(entry.equals(word)||dictionary.get(entry).equals(word)){
                toRemove.add(entry);
            }

        }
        for(String toBeRemoved : toRemove){
            dictionary.remove(toBeRemoved);
        }

    }

    public boolean load(){

        try{
            File f = new File(file);
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()){
                String words = reader.nextLine();
                String[] wordSplit = words.split(":");
                dictionary.put(wordSplit[0],wordSplit[1]);
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public boolean save(){
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (String word : dictionary.keySet()) {
                fileWriter.write(word + ":" + dictionary.get(word) + "\n");
            }
            fileWriter.close();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
