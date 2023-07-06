class RaindropConverter {

    String convert(int number) {
        String result = "";
        if(number % 105 == 0) {
            result = "PlingPlangPlong";
        } else if(number % 15 == 0) {
            result = "PlingPlang";
        } else if(number % 21 == 0) {
            result = "PlingPlong";
        } else if(number % 35 == 0) {
            result = "PlangPlong";
        } else if(number % 3 == 0) {
            result = "Pling";
        } else if(number % 5 == 0) {
            result = "Plang";
        } else if(number % 7 == 0) {
            result = "Plong";
        } else {
            result = String.valueOf(number);
        }
        return result;
    }
}
