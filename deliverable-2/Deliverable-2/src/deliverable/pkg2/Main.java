package deliverable.pkg2;

import content.CardsOnHand;
import content.DisplayedCard;
import content.cards;
import java.util.Scanner;

public class Main {

    public static boolean equals(cards[] arr,cards[] ar, String target){
         for (cards s : arr) {
            if (s.name().equals(target)) {
                for(cards x : ar){
                if(x.name().equals(target)){
                    return true;
                }
                }
                return false;
            }
        }
        return false;
    }
    
    public static boolean contains(cards[] arr, String target) {
        for (cards s : arr) {
            if (s.name().equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        boolean keepPlaying = true;
        int numRounds = 0;
        int user1Wins = 0;
        int user2Wins = 0;
        int user1RoundsWon = 0;
        int user2RoundsWon = 0;
        cards[] user1cards = new cards[4];
        cards[] user2cards = new cards[4];

        while (keepPlaying) {
            System.out.println("Starting round " + (numRounds + 1));
            System.out.println("Do you want to generate the Face-Up card? (yes/no)");
            String mainCard = k.next();
            if (mainCard.equalsIgnoreCase("yes")) {
                String faceUpCard = new DisplayedCard().toString();
              // System.out.println("Face-Up card has: " + faceUpCard);
            } else {
                break;
            }

            System.out.println("Do you want to generate the User cards? (yes/no)");
            String UserCards = k.next();
            if (UserCards.equalsIgnoreCase("yes")) {
                CardsOnHand coH = new CardsOnHand();
                cards[][] userCards = coH.generateCards();
                user1cards = userCards[0];
                user2cards = userCards[1];
                System.out.println("User 1's cards:");
                for (cards c : user1cards) {
                    System.out.println(c.toString());
                }

                System.out.println("User 2's cards:");
                for (cards c : user2cards) {
                    System.out.println(c.toString());
                }
            } else {
                break;
            }
            String faceUpCard = new DisplayedCard().toString();
            String winner;
          //  System.out.println("Enter the face-up card you want to check:");
          //  String faceUp = faceUpCard;
            
            if(equals(user1cards, user2cards, faceUpCard)){
                winner = "Tie"; 
            } else if (contains(user2cards, faceUpCard)) {
                winner = "User 2";
                user2Wins++;
                user2RoundsWon++;
            } else if (contains(user1cards, faceUpCard)) {
                winner = "User 1";
                user1Wins++;
                user1RoundsWon++;
            }else {
                winner = "No one";
            }

            System.out.println("Winner is " + winner);
            System.out.println("User 1 wins: " + user1Wins);
            System.out.println("User 2 wins: " + user2Wins);

            numRounds++;
            System.out.println("Do you want to play another round? (yes/no)");
            String playAgain = k.next();
            if (playAgain.equalsIgnoreCase("no")) {
                keepPlaying = false;
            }
        }

        System.out.println("Total rounds played: " + numRounds);
        System.out.println("User 1 won " + user1RoundsWon + " rounds");
    }

    public static String getCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter card name:");
        String cardName = scanner.nextLine();
        return cardName;
    }
}
