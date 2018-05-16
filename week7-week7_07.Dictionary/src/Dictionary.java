import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private Map<String,String> dictionary;

    public Dictionary(){
        dictionary = new HashMap<String, String>();
    }

    public void add(String word, String translation){
        dictionary.put(word,translation);
    }

    public String translate(String word){
        for(String key : dictionary.keySet()){
            if(key.equals(word)){
                return dictionary.get(key);
            }
        }
        return null;
    }

    public int amountOfWords(){
        return dictionary.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> translations = new ArrayList<String>();
        for(String key : dictionary.keySet()){
            String str = String.format("%s = %s",key,dictionary.get(key));
            translations.add(str);
        }
        return translations;
    }
}
