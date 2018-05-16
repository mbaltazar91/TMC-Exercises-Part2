import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Jump {

    private Random random;
    private int length;
    private ArrayList<Integer> judgeScores;
    private int points;



    public Jump(){
        random = new Random();
        length = setLength();
        judgeScores = new ArrayList<Integer>();
        generateScores();
        setPoints();
    }

    public int setLength(){
        return random.nextInt(61)+60;

    }

    public void generateScores() {
        for(int i =0; i<5; i++){
            judgeScores.add(random.nextInt(11)+10);
        }
    }

    public void setPoints(){
        Collections.sort(judgeScores);
        int sum = 0;
        for(int i = 1; i<judgeScores.size()-1; i++){
            sum += judgeScores.get(i);
        }
        this.points = sum + length;

    }

    public int getLength(){
        return length;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<Integer> getJudgeScores() {
        return judgeScores;
    }
}
