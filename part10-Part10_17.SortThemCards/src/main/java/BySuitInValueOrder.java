
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class BySuitInValueOrder implements Comparator<Card>  {

    @Override
    public int compare(Card card1, Card card2) {
        if (card1.getSuit().ordinal() > card2.getSuit().ordinal()) {
            //1
            return 1;
        } else if (card1.getSuit().ordinal() < card2.getSuit().ordinal()) {
            return -1;
        } else {
            if (card1.getValue() > card2.getValue()) {
                return 1;
            } else if (card1.getValue() < card2.getValue()) {
                return -1;
            } else {
                return 0;
            }
    }
    
}
}
