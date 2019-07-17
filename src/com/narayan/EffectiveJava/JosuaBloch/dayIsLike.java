package com.narayan.EffectiveJava.JosuaBloch;


enum Day
{
    SUNDAY("Sun Sun"), MONDAY(2), TUESDAY(3), WEDNESDAY(4),
    THURSDAY(5), FRIDAY(6), SATURDAY(7);

    Day(String idx) {
        this.idx=idx;
    }
    Day(int id) {
        this.id=id;
    }

    private String idx;
    private int id;

    public String getIdx() {
        return idx;
    }

    public int getId() {
        return id;
    }
}

public class dayIsLike{

        Day day;

        // Constructor
        public dayIsLike(Day day)
        {
            this.day = day;
        }

    public ArrayList<String>  AllString() {
        ArrayList<String> stringDay = new ArrayList<String>();
        for (Day day : Day.values()) {
            stringDay.add( day.toString() );
            System.out.println( stringDay );
        }
        return stringDay;
    }

    @Override
    public String toString() {
        Day arr[] = Day.values();

        for (Day col : arr)
        {
            // Calling ordinal() to find index
            // of color.
            System.out.print(col + " ,  "
                    /*+ col.ordinal() */ );
        }



        return "dayIsLike{" +
                "day=" + day +
                '}';
    }

    // Prints a line about Day using switch
        public void dayIsLike()
        {
            switch (day)
            {
                case MONDAY:
                    System.out.println("Mondays are bad.");
                    break;
                case FRIDAY:
                    System.out.println("Fridays are better.");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Weekends are best.");
                    break;
                default:
                    System.out.println("Midweek days are so-so.");
                    break;
            }

        }
    }
