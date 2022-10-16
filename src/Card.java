
public class Card {
    
    /*
     * 1.Create the following classes.
     * Card
     *  -Fields
     *      1. value -  contains value from 2-14 cards 2-ace
     *      2. name - Ace of diamonds or two of hearts
     *   -Methods
     *      1.  Getters and Setters
     *      2.  describe (prints out information about a card)        
     */
    
    //fields
    private int value; //contains a value from 2-14 representing cards 2-Ace
    private String name; //e.g. Ace of Diamonds, or Two of Hearts
    private int suit; //diamonds, hearts, clubs or spades
    
    //constructor
    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    } 

    //getters and setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //methods
    
    //describe method - prints out information about a card
    public void describe() {
        System.out.println(toString());
        }
    
    //combine the suit and value to get the name of the card; e.g. Ace of Diamonds, Two of Hearts, etc. 
    public String toString() {
    StringBuilder describeCard = new StringBuilder(); 
        
    if (value == 11) {
        describeCard.append("Jack");
    } else if (value == 12) {
        describeCard.append("Queen");
    } else if (value == 13) {
        describeCard.append("King");
    } else if (value == 14) {
        describeCard.append("Ace");
    } else {
        describeCard.append(value);
    }
    
    describeCard.append(" of ");

    if(suit == 1) {
        describeCard.append("Diamonds");
    } else if (suit == 2) {
        describeCard.append("Hearts");
    } else if (suit == 3) {
        describeCard.append("Clubs");
    } else if (suit == 4) {
        describeCard.append("Spades");
    } else {
        return null;
    }
    
    //return the card name - the result of the combined strings
    name = describeCard.toString(); 
    return name;
    }

}

