class RaindropConverter {

    String convert(int number) {
        StringBuilder rainSong = new StringBuilder();
        if (number % 3 == 0) { rainSong.append("Pling"); }
        if (number % 5 == 0) { rainSong.append("Plang"); }
        if (number % 7 == 0) { rainSong.append("Plong"); }
        if (rainSong.length() == 0) {rainSong.append(number);}
        return rainSong.toString();
    }
}
