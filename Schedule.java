import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Schedule {

    private ArrayList<Worker> workers = new ArrayList<Worker>();
    private ArrayList<ScheduleBlock> schedule = new ArrayList<ScheduleBlock>();

    public void addSchedule(String name){
        workers.add(new Worker(name));
    }

     /*public void generateStudyPlan(){
        schedule = new ArrayList<ScheduleBlock>();
            for(Worker w : workers){
                    schedule.add(new ScheduleBlock(w.getName(), Calendar.getInstance()));
                }           
            }   */
}