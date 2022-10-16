import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

//      3.  Instantiate a Deck and two Players, call the shuffle method on the deck.
//      4.  Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
//      5.  Using a traditional for loop, iterate 26 times and call the flip method for each player.
//      a.  Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
//      6.  After the loop, compare the final score from each player. 
//      7.  Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

    
        //3. Instantiate a Deck and two Players, call the shuffle method on the deck.
        Deck newDeck = new Deck();
        List<Card> hand1 = new ArrayList<Card>();
        List<Card> hand2 = new ArrayList<Card>();
        
        Player player1 = new Player("Ken", hand1 );
        Player player2 = new Player("George", hand2);

        newDeck.shuffle();
        
        //4. Using a traditional for loop, iterate 52 times calling the Draw method on the 
        //other player each iteration using the Deck you instantiated.
        for(int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
            player1.draw(newDeck);
        } else {
        player2.draw(newDeck);
        }
    }
        
        System.out.println("\nDescription of Players: ");
        System.out.println("\nPlayer 1: ");
        player1.describe();
        
        System.out.println("\nPlayer 2: ");
        player2.describe();
        
        //5. Using a traditional for loop, iterate 26 times and call the flip method for each player.
        for(int f = 0; f < 26; f++) {
            System.out.println("\nIt's time to flip your cards!");
            
            player1.flip();
            player2.flip();
            
            System.out.println("Player 1 flipped a: " + player1.flip());
            System.out.println("Player 2 flipped a: " + player2.flip());
            
            //a. Compare the value of each card returned by the two player’s flip methods. 
            //Call the incrementScore method on the player whose card has the higher value.
            if(player1.flip().getValue() > player2.flip().getValue() ) {
                player1.incrementScore();
            } else if(player2.flip().getValue() > player1.flip().getValue()) {
                player2.incrementScore(); 
            } else {
                System.out.println("It's a tie. We have a draw!");
            }
            
            System.out.println(player1.getName() + ": " + player1.getScore() + " points.");
            System.out.println(player2.getName() + ": " + player2.getScore() + " points.");

            player1.removeTopCard();
            player2.removeTopCard();
             
            System.out.println("\nHere is each player's hand: ");
            System.out.println("\nPlayer 1: ");
            player1.describe();
                
            System.out.println("\nPlayer 2: ");
            player2.describe();
        }
        
        //6.    After the loop, compare the final score from each player. 
        //7.    Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
        if(player1.getScore() > player2.getScore()) {
            System.out.println("\nPlayer 1 wins with " + player1.getScore() + " points!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("\nPlayer 2 wins with " + player2.getScore() + " points!");
        } else {
            System.out.println("\nYou tied. It's a Draw");
        }

    }

}