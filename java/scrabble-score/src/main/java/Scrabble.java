import java.util.*;

class Scrabble {
    private final String[] onePointLetters = {"A", "I", "E", "O", "U", "L", "N", "R", "S", "T"};
    private final String[] twoPointsLetters = {"D", "G"};
    private final String[] threePointsLetters = {"B", "C", "M", "P"};
    private final String[] fourPointsLetters = {"F", "H", "V", "W", "Y"};
    private final String[] fivePointsLetters = {"K"};
    private final String[] eightPointsLetters = {"J", "X"};
    private final String[] tenPointsLetters = {"Q", "Z"};

    String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        int score = 0;

        List<String> onePointList = Arrays.asList(onePointLetters);
        List<String> twoPointsList = Arrays.asList(twoPointsLetters);
        List<String> threePointsList = Arrays.asList(threePointsLetters);
        List<String> fourPointsList = Arrays.asList(fourPointsLetters);
        List<String> fivePointsList = Arrays.asList(fivePointsLetters);
        List<String> eightPointsList = Arrays.asList(eightPointsLetters);
        List<String> tenPointsList = Arrays.asList(tenPointsLetters);

        char[] wordArray = word.toCharArray();

        for (int i = 0; i < wordArray.length; i++) {
            String letter = String.valueOf(word.charAt(i));

            if (onePointList.contains(letter)) {
                score++;
            } else if (twoPointsList.contains(letter)) {
                score += 2;
            } else if (threePointsList.contains(letter)) {
                score += 3;
            } else if (fourPointsList.contains(letter)) {
                score += 4;
            } else if (fivePointsList.contains(letter)) {
                score += 5;
            } else if (eightPointsList.contains(letter)) {
                score += 8;
            } else if (tenPointsList.contains(letter)) {
                score += 10;
            }
        }

        return score;
    }

}
