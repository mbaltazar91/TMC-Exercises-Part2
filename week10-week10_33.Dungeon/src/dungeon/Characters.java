package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Characters {

    private List<Vampire> vampireList;
    private Player player;
    Random random = new Random();

    public Characters() {
        vampireList = new ArrayList<Vampire>();
        player = new Player();
    }

    public void createVampires(int vampires) {
        for (int i = 0; i < vampires; i++) {
            vampireList.add(new Vampire());
        }
    }

    public List<Vampire> getVampireList() {
        return vampireList;
    }

    public Player getPlayer() {
        return player;
    }

    public void remove(Player p, List<Vampire> v) {
        List<Vampire> removed = new ArrayList<Vampire>();
        for (Vampire vampire : v) {
            if (p.yPos == vampire.yPos && p.xPos == vampire.xPos) {
                removed.add(vampire);
            }
        }
        v.removeAll(removed);

    }

    public void printCharacters(Characters c) {
        System.out.println(c.getPlayer());
        for (Vampire v : c.getVampireList()) {
            System.out.println(v);
        }
        System.out.println();
    }

    public void move(int height, int length,boolean vampireMove) {
        Scanner sc = new Scanner(System.in);
        String move = sc.nextLine().trim();
        char[] letters = move.toCharArray();
        for (char letter : letters) {
            int xDiff = 0;
            int yDiff = 0;
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
            if ((player.xPos + xDiff >= 0 && player.xPos + xDiff <= length - 1) && (player.yPos + yDiff >= 0 && player.yPos + yDiff <= height - 1)) {
                player.xPos += xDiff;
                player.yPos += yDiff;

            }
            if(vampireMove) {
                for (Vampire v : vampireList) {
                    int xDiffVamp = 0;
                    int yDiffVamp = 0;
                    int vampMove = random.nextInt(4) + 1;
                    if (vampMove == 1) {
                        xDiffVamp += 1;
                    }
                    if (vampMove == 2) {
                        xDiffVamp -= 1;
                    }
                    if (vampMove == 3) {
                        yDiffVamp += 1;
                    }
                    if (vampMove == 4) {
                        yDiffVamp -= 1;
                    }
                    if ((v.xPos + xDiffVamp >= 0 && v.xPos + xDiffVamp <= length - 1) && (v.yPos + yDiffVamp >= 0 && v.yPos + yDiffVamp <= height - 1)) {
                        v.xPos += xDiffVamp;
                        v.yPos += yDiffVamp;
                    }
                }
            }
            remove(getPlayer(),getVampireList());
        }
    }
}
