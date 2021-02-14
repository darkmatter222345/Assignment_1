
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
        //This will be printed 7 times
        Card[] TheHand = new Card[7];
       
          for (int i=0; i<TheHand.length; i++)
        {
            Card a = new Card();
            
            a.setValue((int)((Math.random()*13)+1));
            a.setSuit(Card.SUITS[(int)((Math.random()*4)+0)]);
            
           //This prints out the value of the setted value and the setted get
            System.out.println(a.getValue() + " of " + a.getSuit());
      
            //The array will now equal to Card a 
            TheHand[i] = a;

        }
       
    }
    
}
