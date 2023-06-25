import java.util.Arrays;
class ResistorColor {
    private final String[] resistors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        return Arrays.asList(resistors).indexOf(color);
    }
    String[] colors() {
        return resistors;
    }
}