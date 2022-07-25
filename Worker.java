
public class Worker {

    public String name;

    public Worker(String schedule) {
        String reg = ":L";

        String[] res = schedule.split(reg);
        name = res[0];
        res[1] = "L" + res[1];

        String[] time = res[1].split(",");

        for(int i=0;i<5;i++)
        {
            String[] d = time[i].split("\\(");
            if(!d[1].contains("*")) {
                String[] f = d[1].split("-");
                String[] startTime = f[0].split(":");
                String[] endTime = f[1].split(":");
                endTime[1] = endTime[1].substring(0, endTime[1].length()-1);

                int startWork = (Integer.parseInt(startTime[0]) - 8 ) * 2+ (startTime[1].equals("30") ? 1 : 0);
                int endWork =  (Integer.parseInt(endTime[0]) - 8 ) * 2 + (endTime[1].equals("30") ? 1 : 0);

                for(int j= startWork; j<= endWork; j++)
                {
                    work[i][j] = true;
                }
            }
            else
            {
                for(int j= 0; j < 25; j++)
                {
                    work[i][j] = true;
                }
            }

            if(d[0].contains("!"))
            {
                for(int j=0;j<25;j++)
                {
                    work[i][j] = !work[i][j];
                }
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void ShowSchedule()
    {
        for(int i=0;i<25;i++)
        {
            System.out.print(((i/2)+8 ) < 10 ? "0":"");
            System.out.print((i/2)+8 + ":" +(i%2==0 ? "00" : "30")+ " - ");
            for(int j=0;j<5;j++)
            {
                System.out.print(work[j][i] ? 1 : 0);
            }
            System.out.println();
        }
    }

    public boolean[][] work = new boolean[5][25];
}
