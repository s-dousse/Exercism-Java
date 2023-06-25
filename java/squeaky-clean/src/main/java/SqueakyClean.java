import java.lang.Character;

class SqueakyClean {
    static String clean(String identifier) {
        String result = "";
        char[] charArr = identifier.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if (Character.isSpaceChar(charArr[i])) {
                result = result + "_";
            } else if (Character.isISOControl(charArr[i])) {

            } else if (charArr[i] == '-') { // remove dashes (skip character) , turn next character to upper case
                i++;
                result = result + Character.toUpperCase(charArr[i]);
            } else if (Character.isletter(charArr[i])) { // remove non Letter character
                result = result + charArr[i];
            }
            return result;
        }
        return result;
    }
}