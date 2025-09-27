package datatypes;

public class MinutesToDays {

    public static void main(String[] args) {
        long minutes = 3456789;
        long years = minutes / (24 * 60 * 365);
        long days = (minutes / 60 / 24) % 365;

        System.out.println(years + " years" + " " + days + " days");
    }
}
