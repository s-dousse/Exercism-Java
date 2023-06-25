class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < identifier.length(); i++) {
            char currentChar = identifier.charAt(i);
            if (Character.isSpaceChar(currentChar)) {
                cleaned.append("_");
            } else if (Character.isISOControl(currentChar)) {
                cleaned.append("CTRL");
            } else if (currentChar == '-') {
                i++;
                char nextChar = identifier.charAt(i);
                if (Character.isLetter(nextChar)) {
                    cleaned.append(Character.toUpperCase(nextChar));
                } else if (!Character.isDigit(nextChar)) {
                    cleaned.append(nextChar);
                }
            } else if (Character.isLetter(currentChar) && (currentChar < 'α' || currentChar > 'ω')) {
                cleaned.append(currentChar);
            }
        }
        return cleaned.toString();
    }
}
