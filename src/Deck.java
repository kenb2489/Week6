import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    /*
     * i.Fields
     *      1.  cards (List of Card)
     * ii.Methods
     *      1.  shuffle (randomizes the order of the cards)
     *      2.  draw (removes and returns the top card of the Cards field)
     *      3.  In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
*/
    //fields
    private List<Card> cards;
    
    //constructor
    //when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards
    public Deck() {
        cards = new ArrayList<Card>();
        for(int s = 1; s < 5; s++) {
        for(int i = 2; i < 15; i ++) {
            cards.add(new Card(s,i));
            }
        }
    }
    
    //methods
    //shuffle the deck (randomizes the order of the cards)
    public void shuffle() {
        SecureRandom rnd = new SecureRandom();
        Collections.shuffle(cards, rnd);
    }
    
    //draw (removes and returns the top card of the Cards field)
    public Card draw(){
        int topCard = 0;
        if (topCard < cards.size()) {
            cards.get(topCard);
            return cards.remove(topCard++);
        } else {
            return null;
    }
}
}