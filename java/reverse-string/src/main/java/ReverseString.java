class ReverseString {

    String reverse(String inputString) {
        String reversedStr = "";
        // for each character of the given str
        for (int i = 0; i < inputString.length(); i++) {
            // add the character at the beginning of the reverse string
            reversedStr = inputString.charAt(i) + reversedStr;
        }
        return reversedStr;
    }
}