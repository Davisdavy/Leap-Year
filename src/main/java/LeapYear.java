import java.util.ArrayList;

public class LeapYear {

    private int year;
    private static ArrayList<LeapYear> mInstances = new ArrayList<>();

    public LeapYear(int year){
        this.year = year;
    }

    public int getYear() {
        return year;

    }

    public static ArrayList<LeapYear> getAll() {
        return mInstances;
    }

    public boolean isLeapYear(int year) {
        if ( year % 400 == 0 ) {
            return true;
        } else if ( year % 100 == 0 ) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

}