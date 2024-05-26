import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class MaxProfitInJobScehduling {
    public static void main(String[] args) {

    }

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[][] jobs = new int[startTime.length][3];
        for (int i = 0; i < startTime.length; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[1]));
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] job : jobs
        ) {
            int val = job[2] + dp.floorEntry(0).getValue();
            if (val > dp.lastEntry().getValue()) {
                dp.put(job[2], val);
            }

        }
        return dp.lastEntry().getValue();

    }

}

