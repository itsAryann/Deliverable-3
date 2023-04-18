package content;

import java.util.Random;

public class DisplayedCard {
    
    public DisplayedCard() {
        cards[] card = cards.values();
        Random rmd = new Random();
        int index = rmd.nextInt(card.length);
        System.out.println("Face-up card has: "+card[index]);
    }
}
