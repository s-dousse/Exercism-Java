class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }

    int computeSumOfSquaresTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i * i;
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
