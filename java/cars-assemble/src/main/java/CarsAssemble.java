public class CarsAssemble {
    private final int CARS_PER_HOUR_RATE = 221;

    public double productionRatePerHour(int speed) {
        switch (speed) {
            case 1:
            case 2:
            case 3:
            case 4:
                return speed * CARS_PER_HOUR_RATE;
            case 5:
            case 6:
            case 7:
            case 8:
                return  speed * CARS_PER_HOUR_RATE * 0.9;
            case 9:
                return speed * CARS_PER_HOUR_RATE * 0.8;
            case 10:
                return speed * CARS_PER_HOUR_RATE * 0.77;
            default:
                return speed * CARS_PER_HOUR_RATE;
        }
    }

    public int workingItemsPerMinute(int speed) {
      return (int) productionRatePerHour(speed) / 60;
    }
}
