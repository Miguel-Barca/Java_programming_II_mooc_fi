
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 *
 * @author Miguel
 */
public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
     
    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        this.hand.stream()
                .forEach(card -> System.out.println(card.toString()));
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
                            
        Collections.sort(hand, comparator);
        
    }

    public int sum() {
        int sum = 0;

        for (Card card : this.hand) {
            sum = sum + card.getValue();
        }

        return sum;
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    
    
    @Override
    public int compareTo(Hand hand) {
        if (sum() == hand.sum()) {
            return 0;
        } else if (sum() > hand.sum()) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
