import java.util.Calendar;

public class ScheduleBlock {
    private String name;
    private Calendar startTime;
    private Calendar finishTime;


    public ScheduleBlock(String name, Calendar startTime, Calendar finishTime)
    {
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getName(){ return name; }
    public Calendar getFinishTime() { return finishTime; }
    public Calendar getStartTime() { return startTime; }
}
