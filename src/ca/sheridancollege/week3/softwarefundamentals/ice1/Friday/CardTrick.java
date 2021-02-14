
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;
import java.util.Random;
 

/**
 * @author Leroy
 * Student Number: 991612307
 * Student: Leroy Osei
 */
public class CardTrick {
    public static void main(String[] args)
    {
        //This will be printed 7 times
        Card[] TheHand = new Card[7];
       
          for (int i=0; i<TheHand.length; i++)
        {
            Card a = new Card();
            //This will make random numbers to generate 
            a.setValue((int)((Math.random()*13)+1));
           
            a.setSuit(Card.SUITS[(int)((Math.random()*4)+0)]);
            
           //This prints out the value of the setted value and the setted get
            System.out.println(a.getValue() + " of " + a.getSuit());
      
            //The array will now equal to Card a 
            TheHand[i] = a;
           
           /** Now when this program runs it would spew an example like this
           12 of Spades
           1 of Diamonds
           3 of Hearts
           10 of Diamonds
           3 of Hearts
           8 of Spades
           6 of Clubs

        }
       
    }
    
}
