class Darts {
    private final double OUTER_CIRCLE_RADIUS = 10d;
    private final double MIDDLE_CIRCLE_RADIUS = 5d;
    private final double INNER_CIRCLE_RADIUS = 1d;

    int score(double xOfDart, double yOfDart) {
        double throwRadius = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));
        int pts = 0;
        if (throwRadius <= INNER_CIRCLE_RADIUS){
            pts = 10;
        } else if (throwRadius <= MIDDLE_CIRCLE_RADIUS) {
            pts = 5;
        } else if (throwRadius <= OUTER_CIRCLE_RADIUS) {
            pts = 1;
        } else if (throwRadius > OUTER_CIRCLE_RADIUS) {
            pts = 0;
        }
        return pts;
    }
}
