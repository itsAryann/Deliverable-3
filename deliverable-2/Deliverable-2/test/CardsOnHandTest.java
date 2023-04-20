import content.CardsOnHand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dell
 */
public class CardsOnHandTest {
    
    @Test
    public void testGenerateCardsEmpty() {
        CardsOnHand coh = new CardsOnHand();
        CardsOnHand.cards[][] userCards = coh.generateCards();
        userCards[0] = new CardsOnHand.cards[0];
        userCards[1] = new CardsOnHand.cards[0];
        assertEquals(0, userCards[0].length);
        assertEquals(0, userCards[1].length);
   

    }
    
    
}
