import java.lang.Character;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder str = new StringBuilder();

        char[] charArr = identifier.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if (Character.isSpaceChar(charArr[i])) {
                str.append("_");
            } else if (Character.isISOControl(charArr[i])) {
                str.append("CTRL");
            } else if (charArr[i] == '-') {
                i++;
                if (Character.isLetter(charArr[i])) {
                    str.append(Character.toUpperCase(charArr[i]));
                } else if (Character.isDigit(charArr[i])) {
                    str.append("");
                } else {
                    str.append(charArr[i]);
                }
            } else if(!Character.isLetter(charArr[i]) || (charArr[i] >= 'α' && charArr[i] <= 'ω')) {
                str.append("");
            } else {
                str.append(charArr[i]);
            }
        }

        return str.toString();
    }
}