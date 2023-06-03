public class Twofer {
    private boolean likesCookies = true;
    public String twofer(String name, boolean likesCookies) {
        String cookieEater = (likesCookies) && !(name == null) ? name : "you";
        return String.format("One for %s, one for me.", cookieEater );
    }

    public String twofer(String name) {
        return twofer(name, likesCookies);
    }
}