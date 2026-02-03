public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        fixParameters();
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }

    public void setMinute(int minute)
    {
        this.minute = minute;
    }

    public void setSecond(int second)
    {
        this.second = second;
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    public String toUniversal()
    {
        return (hour >= 10 ? hour : "0" + hour) + ":" +
                (minute >= 10 ? minute : "0" + minute) + ":" +
                (second >= 10 ? second : "0" + second);
    }

    public String toStandard()
    {
        return ((hour % 12) >= 10 ? (hour % 12) : "0" + (hour % 12)) + ":" +
                (minute >= 10 ? minute : "0" + minute) + ":" +
                (second >= 10 ? second : "0" + second) + ((hour > 12)? " PM" : " AM");
    }

    public void add(Time time)
    {
        hour += time.getHour();
        minute += time.getMinute();
        second += time.getSecond();

        fixParameters();
    }

    private void fixParameters()
    {
        if (second >= 60)
        {
            minute += second / 60;
            second %= 60;
        }
        else if (second < 0) {
            second = 0;
        }
        if (minute >= 60)
        {
            hour += minute / 60;
            minute %= 60;
        }
        else if (minute < 0) {
            minute = 0;
        }
        if (hour >= 24)
        {
            hour %= 24;
        }
        else if (hour < 0) {
            hour = 0;
        }
    }
}