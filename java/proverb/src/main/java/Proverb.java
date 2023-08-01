class Proverb {
    String[] words;
    StringBuilder proverb = new StringBuilder() ;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) return "";
        for (int i = 0; i < (words.length - 1); i++) {
            String line = String.format("For want of a %s the %s was lost.\n", words[i], words[i + 1]);
            proverb.append(line);
        }

        String line = String.format("And all for the want of a %s.", words[0]);
        proverb.append(line);

        return proverb.toString();
    }
}
