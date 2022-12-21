import java.net.StandardSocketOptions;

public class CardDeck {

    public static void main(String[] args) {

        int index; // Temporary variable

        // Generate a random order for 52 integers (0-51) to represent
        // a standard deck of 52 playing cards.

        Randomizer cardDeck = new Randomizer(52);

        // Print cards in order
        System.out.println("Card Deck In Order");
        for (index = 0; index < 52; ++index) {
            playingCardValue(index+1);
        }

        System.out.println("\nRandom Card Deck Order");
        // Print cards in random order
        for (index = 0; index < 52; ++index) {
            playingCardValue(cardDeck.getInt(index)+1);
        }
    }

    public static void playingCardValue(int cardNum) {
        if (cardNum < 1 || cardNum > 52) {
            System.out.println("Invalid Card");
            return;
        }

        // Card Values
        // 1-13 Clubs
        // 14-26 Hearts
        // 27-39 Spades
        // 40-52 Diamonds

        // Dividend is the suit
        int suit = (cardNum - 1) / 13;

        // Modulus is numeric value;
        int faceValue = (cardNum % 13);

        // Display face value of card
        if (faceValue == 1) {
            System.out.print("Ace ");
        } else if (faceValue >= 2 && faceValue <= 10) {
            System.out.print(faceValue + " ");
        } else if (faceValue == 11) {
            System.out.print("Jack ");
        } else if (faceValue == 12) {
            System.out.print("Queen ");
        } else if (faceValue == 0) {
            System.out.print("King ");
        }

        // Generate suit

        switch (suit) {
            case 0:
                System.out.println("of Clubs");
                break;
            case 1:
                System.out.println("of Hearts");
                break;
            case 2:
                System.out.println("of Spades");
                break;
            case 3:
                System.out.println("of Diamonds");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}

