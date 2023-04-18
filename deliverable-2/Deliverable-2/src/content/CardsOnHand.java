package content;

import java.util.Random;

public class CardsOnHand {
    private final int NUM_CARDS_PER_USER = 3;

    public cards[][] generateCards() {
        cards[] allCards = cards.values();
        Random rmd = new Random();
        cards[][] userCards = new cards[2][NUM_CARDS_PER_USER];
        for (int i = 0; i < NUM_CARDS_PER_USER; i++) {
            userCards[0][i] = allCards[rmd.nextInt(allCards.length)];
            userCards[1][i] = allCards[rmd.nextInt(allCards.length)];
        }
        return userCards;
    }
}
