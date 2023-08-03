import java.util.*;

class Scrabble {
    private final String onePointLetters = "AIEOULNRST";
    private final String twoPointsLetters = "DG";
    private final String threePointsLetters = "BCMP";
    private final String fourPointsLetters = "FHVWY";
    private final String fivePointsLetters = "K";
    private final String eightPointsLetters = "JX";
    private final String tenPointsLetters = "QZ";

    String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        int score = 0;
        
        for (int i = 0; i < word.length(); i++) {
            String letter = String.valueOf(word.charAt(i));

            if (onePointLetters.contains(letter)) {
                score++;
            } else if (twoPointsLetters.contains(letter)) {
                score += 2;
            } else if (threePointsLetters.contains(letter)) {
                score += 3;
            } else if (fourPointsLetters.contains(letter)) {
                score += 4;
            } else if (fivePointsLetters.contains(letter)) {
                score += 5;
            } else if (eightPointsLetters.contains(letter)) {
                score += 8;
            } else if (tenPointsLetters.contains(letter)) {
                score += 10;
            }
        }

        return score;
    }

}
