import content.DisplayedCard;
import content.cards;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DisplayedCardTest {

    @Test
    public void testDisplayedCardGoodCase() {
        DisplayedCard displayedCard = new DisplayedCard();
        assertNotNull(displayedCard);
        // Ensure that the face-up card is one of the valid cards in the enum
        assertTrue(cards.valueOf(displayedCard.card[0].name()) != null);
    }
    
    @Test
    public void testDisplayedCardBadCase() {
        // Test with an empty card array
        DisplayedCard displayedCard = new DisplayedCard();
        displayedCard.card = new cards[0];
        assertNull(displayedCard.card);
    }
    
    @Test
    public void testDisplayedCardBoundaryCase() {
        DisplayedCard displayedCard = new DisplayedCard();
        // Test with a large index to ensure it doesn't go out of bounds
        displayedCard.cards= new cards[10];
        Random rmd = new Random();
        int index = rmd.nextInt(displayedCard.cards.length);
        assertNotNull(displayedCard.cards[index]);
    }
    
    @Test
    public void testCardsGoodCase() {
        // Test that all cards in the enum are valid
        for (cards card : cards.values()) {
            assertNotNull(card);
        }
    }
    
    @Test
    public void testCardsBadCase() {
        // Test that a non-existent card is not valid
        assertNull(cards.valueOf("K"));
    }
    
    @Test
    public void testCardsBoundaryCase() {
        // Test that the first and last cards in the enum are valid
        assertNotNull(cards.valueOf("A"));
        assertNotNull(cards.valueOf("J"));
    }
}
