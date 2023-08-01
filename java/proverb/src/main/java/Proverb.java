class Proverb {
    String[] words;
    StringBuilder proverbLines = new StringBuilder() ;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if(words.length == 0) return "";

        if (words.length >= 2) {
            for (int i = 0; i < (words.length - 1); i++) {
                String str = String.format("For want of a %s the %s was lost.", words[i], words[i+1]);
                proverbLines.append(str);
//              proverbLines.append(createMainLineOfProverb(words[i], words[i + 1]));
            }
        }
        if (words.length >= 1) {
            String str = String.format("And all for the want of a %s.", words[0]);
            proverbLines.append(str);
//          proverbLines.append(createLastLineOfProverb(words[0]));
        }

        return proverbLines.toString();
    }

    String createLastLineOfProverb(String word1) {
        return String.format("And all for the want of a %s.", word1);
    }

    String createMainLineOfProverb(String word1, String word2) {
        return String.format("For want of a %s the %s was lost.", word1, word2);
    }
}
