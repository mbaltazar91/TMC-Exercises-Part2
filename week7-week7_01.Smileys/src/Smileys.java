
public class Smileys {

    private static void printWithSmileys(String characterString) {
        String smiley = ":)";
        characterString = " " + characterString + " ";

        if (characterString.length() % 2 == 1) {
            characterString += " ";
        }

        for(int i = 0; i<(characterString.length()/2)+2; i++){
            System.out.print(smiley);
        }
        System.out.println("");
        System.out.println(smiley + characterString + smiley);

        for(int i = 0; i<(characterString.length()/2)+2; i++){
            System.out.print(smiley);
        }
        System.out.println("");



    }

    public static void main(String[] args) {

    }

}
