public class CarsAssemble {
    private final int CARS_PER_HOUR_RATE = 221;

    public double productionRatePerHour(int speed) {
        int producedCars = speed * CARS_PER_HOUR_RATE;
        switch (speed) {
            case 5:
            case 6:
            case 7:
            case 8:
                return  producedCars * 0.9;
            case 9:
                return producedCars * 0.8;
            case 10:
                return producedCars * 0.77;
            default:
                return producedCars;
        }
    }

    public int workingItemsPerMinute(int speed) {
      return (int) productionRatePerHour(speed) / 60;
    }
}
