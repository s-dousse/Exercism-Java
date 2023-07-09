class IsogramChecker {

    boolean isIsogram(String phrase) {
        char[] arr = phrase.toLowerCase().trim().replaceAll("-", "").replaceAll(" ", "").toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
// TODO: Look into streams and collection for refactoring options
