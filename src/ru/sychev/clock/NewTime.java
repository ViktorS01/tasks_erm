package ru.sychev.clock;

public class NewTime extends Time {
    private int u_hours;
    private int u_minutes;

    public NewTime(int seconds, int u_hours) {
        super(seconds + u_hours * 3600);
        setTimeZone(u_hours);
    }

    public NewTime(int hours, int minutes, int seconds, int u_hours, int u_minutes) {
        super((hours + u_hours) % 24, minutes, seconds);
        setTimeZone(u_hours, u_minutes);
    }

    public NewTime setTimeZone(int u_hours) {
        if( u_hours < -12 || u_hours > 14) throw new IllegalArgumentException("Illegal UTC initiation");
        this.u_hours = u_hours;
        return this;
    }

    public NewTime setTimeZone(int u_hours, int u_minutes) {
        if( u_hours < -12 || u_hours > 14 || u_minutes < 0) throw new IllegalArgumentException("Illegal UTC initiation");
        this.u_hours = u_hours;
        this.u_minutes = u_minutes % 60;
        return this;
    }

    public String  getTimeZone(){
        return "( " + u_hours + " : " + u_minutes + " UTC)";
    }

    public int getUtcHours() {
        return u_hours;
    }

    public int getUtcMinutes() {
        return u_minutes;
    }


    @Override
    public String toString() {
        return   super.toString() + " (" + getUtcHours() + " : " + getUtcMinutes() + " UTC) ";
    }
}
