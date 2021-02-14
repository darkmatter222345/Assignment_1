
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;
import java.util.Random;
 

/**
 *
 * @author Leroy
 * Student Number: 991612307
 * Name of the student: Leroy Osei
 */
public class CardTrick {
    public static void main(String[] args)
    {
        Card[] TheHand = new Card[7];
        
          for (int i=0; i<TheHand.length; i++)
        {
            Card a = new Card();
            
            a.setValue((int)((Math.random()*13)+1));
            a.setSuit(Card.SUITS[(int)((Math.random()*4)+0)]);
            
           
      
            
            TheHand[i] = a;

        }
       
    }
    
}
