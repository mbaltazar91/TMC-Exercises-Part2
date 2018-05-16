package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> words;
    private int duplicates;

    public PersonalDuplicateRemover(){
        this.words = new HashSet<String>();
        this.duplicates = 0;
    }

    public void add(String characterString){
        if(words.contains(characterString)){
            duplicates++;
        }
        words.add(characterString);
    }

    public int getNumberOfDetectedDuplicates(){
        return duplicates;
    }

    public Set<String> getUniqueCharacterStrings(){
        return words;
    }

    public void empty(){
        words.clear();
        duplicates = 0;
    }
}
