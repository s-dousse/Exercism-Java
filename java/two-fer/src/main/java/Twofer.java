public class Twofer {
    public String twofer(String name, boolean likesCookies) {
        final String cookieEater = likesCookies && name != null ? name : "you";
        return String.format("One for %s, one for me.", cookieEater );
    }

    public String twofer(String name) {
        return twofer(name, true);
    }
}