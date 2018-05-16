package dungeon;

import java.util.Scanner;

public class Player extends Character {

    public Player(){
        xPos = 0;
        yPos = 0;

    }

    public int getMove(Characters c,int height, int length){
        Scanner sc = new Scanner(System.in);
        String move = sc.nextLine().trim();
        int xDiff = 0;
        int yDiff = 0;
        char[] letters = move.toCharArray();
        for(char letter : letters) {
            if (letter == 'w') {
                yDiff--;
            }
            if (letter == 's') {
                yDiff++;
            }
            if (letter == 'a') {
                xDiff--;
            }
            if (letter == 'd') {
                xDiff++;
            }
        }
        if((xPos+xDiff>=0&&xPos+xDiff<=length-1)&&(yPos+yDiff>=0&&yPos+yDiff<=height-1)){
                for(char i : letters){
                    if (i == 'w') {
                        yPos--;
                    }
                    if (i == 's') {
                        yPos++;
                    }
                    if (i == 'a') {
                        xPos--;
                    }
                    if (i == 'd') {
                        xPos++;
                    }

                }
        }
        return letters.length;
    }






    @Override
    public String toString(){
        String player = String.format("@ %d %d",xPos,yPos);
        return player;
    }
}
