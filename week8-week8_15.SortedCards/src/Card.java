public class Card implements Comparable<Card> {



    public static final int SPADES = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;

    public static final String[] SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
    public static final String[] VALUES = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return VALUES[value] + " of " + SUITS[suit];
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card card){
        if(this.value<card.value){
            return -1;
        }
        if(this.value>card.value){
            return 1;
        }
        if(this.suit<card.suit){
            return -1;
        }
        if(this.suit>card.suit){
            return 1;
        }
        return 0;
    }

}
