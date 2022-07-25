import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String args[]) {
        System.out.println("Program angajati");

        List<Worker> workerList = new ArrayList<Worker>();


        try {
            File myObj = new File("C:\\Users\\Diana\\IdeaProjects\\SharedTimeSchedule\\Main\\src\\Angajati.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                workerList.add(new Worker(data));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        for (Worker w :
                workerList) {
            System.out.println(w.getName());
            w.ShowSchedule();
        }

    }

}
