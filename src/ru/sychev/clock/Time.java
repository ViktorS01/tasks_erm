package ru.sychev.clock;

public class Time {
    private int second_start;

    public Time (int second_start){
        this.second_start = second_start;

        final int hour = getHour();
        final int minute = getMinute();
        final int second_end = getSecond();

        this.second_start = second_end + minute * 60 + hour * 3600;

    }

    public Time (int hour, int minute, int second_start){
        this(second_start + minute * 60 + hour * 3600);
    }

    public Time (){
        this.second_start = second_start;
    }

    public String toString (){
        return getHour() + " : " + getMinute() + " : " + getSecond();
    }

    public int getHour() {
        int hour;
        hour = second_start / 3600;
        if (hour > 24) {
            hour = hour - 24;
        }
        return hour;
    }

    public int getMinute() {
        int hour;
        hour = second_start / 3600;
        if (hour > 24) {
            hour = hour - 24;
        }
        return (second_start - hour * 3600) / 60;
    }

    public int getSecond() {
        return second_start % 60;
    }
}
