package dungeon;

public class Main{

    public static void main(String[] args) {

        new Dungeon(5,5,5,5,false).run();
        /**Scanner sc = new Scanner(System.in);
         String move = sc.next();
         int xDiff = 0;
         int yDiff = 0;
         for (int i = 0; i < move.length(); i++) {
         if (move.charAt(i) == 'w') {
         yDiff--;
         }
         if (move.charAt(i) == 's') {
         yDiff++;
         }
         if (move.charAt(i) == 'a') {
         xDiff--;
         }
         if (move.charAt(i) == 'd') {
         xDiff++;
         }

         }
         System.out.println(xDiff);
         System.out.println(yDiff);
         **/
    }
}




