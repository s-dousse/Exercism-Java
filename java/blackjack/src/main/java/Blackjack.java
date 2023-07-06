public class Blackjack {
    public int parseCard(String card) {
        int parsedCard = 0;
        switch(card) {
            case "ace":
                parsedCard = 11;
                break;
            case "queen":
            case "king":
            case "jack":
            case "ten":
                parsedCard = 10;
                break;
            case "nine":
                parsedCard = 9;
                break;
            case "eight":
                parsedCard = 8;
                break;
            case "seven":
                parsedCard = 7;
                break;
            case "six":
                parsedCard = 6;
                break;
            case "five":
                parsedCard = 5;
                break;
            case "four":
                parsedCard = 4;
                break;
            case "three":
                parsedCard = 3;
                break;
            case "two":
                parsedCard = 2;
                break;
            default :
                break;
        }
        return parsedCard;
    }
    public boolean isBlackjack(String card1, String card2) {
        return (this.parseCard(card1) + this.parseCard(card2)) == 21;
    }
    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && !(dealerScore == 11 || dealerScore == 10)) {
            return "W";
        } else {
            return "S";
        }
    }
    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if(handScore <= 11 || dealerScore >= 7) {
            return "H";
        } else {
            return "S";
        }
    }
    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        if (card1.equals("ace") && card2.equals("ace")) { return "P"; }
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}