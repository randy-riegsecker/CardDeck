public class CardDeck {

        public static void main(String[] args) {
            int i;
            for (i = 1; i <= 52; ++i) {
                playingCardValue(i);
            }
        }

        public static void playingCardValue(int cardNum) {
            if (cardNum < 1 || cardNum > 52) {
                System.out.println("Invalid Card");
                return;
            }

            // System.out.println("Passed Value: " + cardNum);
            // Card Values
            // 1-13 Clubs
            // 14-26 Hearts
            // 27-39 Spades
            // 40-52 Diamonds

            int suit = (cardNum - 1) / 13;
            //System.out.println("Dividend is " + suit);
            int faceValue = (cardNum % 13);
            //System.out.println("Modulus is " + faceValue);

            System.out.print("Card is ");

            // Generate face value of card
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

            switch (suit)
            {
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
}
