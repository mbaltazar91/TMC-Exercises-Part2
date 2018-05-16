package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private Map<String,ArrayList<String>> dictionary;

    public PersonalMultipleEntryDictionary(){
        this.dictionary = new HashMap<String,ArrayList<String>>();
    }

    public void add(String word,String entry){
        if(!dictionary.containsKey(word)){
            dictionary.put(word,new ArrayList<String>());
        }
        dictionary.get(word).add(entry);
        }


    public Set<String> translate(String word){
        Set<String> translations = new HashSet<String>();
        if(dictionary.containsKey(word)) {
            for (String entry : dictionary.get(word)) {
                translations.add(entry);
            }
            return translations;
        }
       return null;

    }

    public void remove(String word){
        if(dictionary.containsKey(word)){
            dictionary.remove(word,dictionary.get(word));
        }
    }
}
