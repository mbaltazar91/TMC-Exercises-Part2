package dungeon;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    Characters c;
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampireMove;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampireMove){
        c = new Characters();
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampireMove = vampireMove;
    }


   public void run() {
       c.createVampires(vampires);
       for (Vampire vampire : c.getVampireList()) {
           vampire.setXPos(length);
           vampire.setYPos(height);
       }
       while (true) {
           if(moves==0||c.getVampireList().size()==0){
               break;
           }

           System.out.println(moves+"\n");
           c.printCharacters(c);
           printBoard(c);
           c.move(height,length,vampireMove);
           if(vampireMove) {
               moves--;
           }
       }

       if(c.getVampireList().size()==0){
           System.out.println("YOU WIN");
       }
       else{
           System.out.println("YOU LOSE");
       }
   }


   public void printBoard(Characters c){
       boolean vamp = false;
       for(int i = 0; i<height; i++){
           for(int j = 0; j<length; j++){
               for(Vampire v : c.getVampireList()){
                   if(v.yPos==i&&v.xPos==j){
                       vamp=true;
                       break;
                   }
               }
               if(vamp==true){
                   System.out.print("V");
                   vamp=false;

               }
               else if(c.getPlayer().yPos==i&&c.getPlayer().xPos==j){
                   System.out.print("@");
               }
               else{
                   System.out.print(".");
               }
           }
           System.out.println();
       }
       System.out.println();
   }




}