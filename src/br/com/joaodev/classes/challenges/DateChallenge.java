package br.com.joaodev.classes.challenges;

public class DateChallenge {

    public int day;
    public int month;
    public int year;

    public DateChallenge() {
        //day = 1;
        //month = 1;
        //year = 1970;
        this(1, 1, 1970);
    }

    public DateChallenge(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String formatDateEN() {
        final String formatEN = "%d-%d-%d";
        return String.format(formatEN, year, month, day);
    }

    public String formatDateBR() {
        final String formatBR = "%d/%d/%d";
        return String.format(formatBR, day, month, year);
    }

    public void printDateEN() {
        System.out.println(this.formatDateEN());
    }

    public void printDateBR() {
        System.out.println(this.formatDateBR());
    }
}
