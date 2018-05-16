import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hands;

    public Hand(){
        hands = new ArrayList<Card>();
    }

    public void add(Card card){
        hands.add(card);
    }

    public void print(){
       for(Card card : hands){
           System.out.printf("%s of %s\n",Card.VALUES[card.getValue()],Card.SUITS[card.getSuit()]);
       }
    }

    public void sort(){
        Collections.sort(hands);
    }

    public int sum(){
        int sum = 0;
        for(Card card : hands){
            sum += card.getValue();
        }
        return sum;
    }

    public int compareTo(Hand hand){
        if(this.sum()<hand.sum()){
            return -1;
        }
        if(this.sum()>hand.sum()){
            return 1;
        }
        return 0;
    }

    public void sortAgainstSuit(){
        SortAgainstSuitAndValue s = new SortAgainstSuitAndValue();
        Collections.sort(hands,s);
    }
}
