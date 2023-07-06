public class Blackjack {
    private final int BLACKJACK = 21;
    private final String STAND = "S";
    private final String HIT = "H";
    private final String SPLIT = "P";
    private final String WIN = "W";
    public int parseCard(String card) {
        switch(card) {
            case "ace":
                return 11;
            case "queen":
            case "king":
            case "jack":
            case "ten":
                return 10;
            case "nine":
                return 9;
            case "eight":
                return 8;
            case "seven":
                return 7;
            case "six":
                return 6;
            case "five":
                return 5;
            case "four":
                return 4;
            case "three":
                return 3;
            case "two":
                return 2;
            default:
                return 0;
        }
    }
    public boolean isBlackjack(String card1, String card2) {
        return (this.parseCard(card1) + this.parseCard(card2)) == BLACKJACK;
    }
    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && !(dealerScore == 11 || dealerScore == 10)) {
            return WIN;
        } else {
            return STAND;
        }
    }
    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return STAND;
        } else if(handScore <= 11 || dealerScore >= 7) {
            return HIT;
        } else {
            return STAND;
        }
    }
    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        if (card1.equals("ace") && card2.equals("ace")) { return SPLIT; }
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
