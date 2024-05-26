import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(temperatures);
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        var stack = new Stack<Integer>();
        int[] ansArry = new int[temperatures.length];
        Arrays.fill(ansArry, 0);
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()]<temperatures[i]){
                var a = stack.pop();
                ansArry[a]=i-a;
            }
            stack.push(i);
        }
        //Arrays.stream(ansArry).forEach(System.out::println);
        return ansArry;

    }
}
