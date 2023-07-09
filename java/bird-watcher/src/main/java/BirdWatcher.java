
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] lastWeekSpotting = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeekSpotting;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] = birdsPerDay[birdsPerDay.length -1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean noBirdSpotted = false;
        for (int birdsCount:birdsPerDay) {
            if (birdsCount == 0) {
                noBirdSpotted = true;
            }
        }
        return noBirdSpotted;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int dayCounter = numberOfDays <= 7 ? numberOfDays : 7;
        int total = 0;
        for (int i = 0; i < dayCounter; i++) {
            total += birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int counter = 0;
        for(int birds:birdsPerDay) {
            if (birds >= 5) {
                counter++;
            }
        }
        return counter;
    }
}
