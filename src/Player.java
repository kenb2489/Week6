import java.util.List;

public class Player {
    /*
     * i.Fields
     *      1.  hand (List of Card)
     *      2.  score (set to 0 in the constructor)
     *      3.  name
     * ii.Methods
     *      1.  describe (prints out information about the player and calls the describe method for each card in the Hand List)
     *      2.  flip (removes and returns the top card of the Hand      
     *      3.  draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
     *      4.  incrementScore (adds 1 to the Player’s score field)
     */
    
    //fields
    private List<Card> hand;
    private int score;
    private String name;
    private int topCard;
    
    //constructor
    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
        getHand();
    }
    
    
    //methods
    
    //describe (prints out information about the player and calls the describe 
    //method for each card in the Hand List
    public void describe() {
        System.out.println(name + " has " + score + " points.");    
        if (hand.isEmpty()) {
            System.out.println(name + " has no cards");
        } else {
            System.out.println(name + "'s cards: ");
        for(Card card: hand) {
            card.describe();
        }
    }
    }
    
    //flip (removes and returns the top card of the Hand)
    public Card flip() {
        int topCard = 0;
        if (topCard < hand.size()) {
            return hand.get(topCard++);
        } else {
            return null;        
    }
    }
    
    public Card removeTopCard() {
        return hand.remove(topCard);
    }
    
    //draw (takes a Deck as an argument and calls the draw method on the deck, 
    //adding the returned Card to the hand field)
    public void draw(Deck deck) {
        hand.add(deck.draw());
        
    }
    
    //incrementScore (adds 1 to the Player’s score field)
    public int incrementScore() {
        return score ++;
    }
    
    //getters and setters
    public List<Card> getHand() {
        return hand;
    }
    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 

}