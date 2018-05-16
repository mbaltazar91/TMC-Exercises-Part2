package game;

import gameoflife.GameOfLifeBoard;

import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height){
        super(width,height);
    }

    public void turnToLiving(int x, int y){
        try {
            super.getBoard()[x][y] = true;
        }
        catch(Exception e){}
    }

    public void turnToDead(int x, int y){
        try {
            super.getBoard()[x][y] = false;
        }
        catch(Exception e){}
    }

    public boolean isAlive(int x, int y) {
        try {
            return super.getBoard()[x][y];
        } catch (Exception e) {
            return false;
        }
    }

    public int getNumberOfLivingNeighbours(int x, int y) {
        int living = 0;
        for(int i = x-1; i<=x+1; i++){
            for(int j = y-1; j<=y+1; j++){
                if(isAlive(i,j)){
                    living++;
                }
            }
        }
        if(super.getBoard()[x][y]==true){
            living--;
        }
        return living;
    }


    public  void initiateRandomCells(double probabilityForEachCell){
        Random random = new Random();
        for(int i = 0; i<getWidth(); i++){
            for(int j = 0; j<getHeight(); j++){
                double num = random.nextDouble();
                super.getBoard()[i][j] = (num<probabilityForEachCell)?true:false;
                }
            }
        }


    public  void manageCell(int x, int y, int livingNeighbours){
        if(isAlive(x,y)){
            if(livingNeighbours<2||livingNeighbours>3){
                turnToDead(x,y);
            }
        }
        if((!isAlive(x,y))&&livingNeighbours==3){
           turnToLiving(x,y);
        }
    }

}
