public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString){
        String str = "";
        for(int i = 0; i<characterString.length(); i++){
            str += (characterString.charAt(i)==(fromCharacter))?toCharacter:characterString.charAt(i);
        }
        return str;
    }
}
