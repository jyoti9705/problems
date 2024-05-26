import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SumSubarrayMins {
    public static void main(String[] args) {

    }

    public int sumSubarrayMins(int[] arr) {
        int length = arr.length;
        int[] left = new int[length];
        int[] right = new int[length];
        Arrays.fill(left, -1);
        Arrays.fill(right, length);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);

        }
        stack.clear();
        for (int i = arr.length - 1; i >= 0; --i) {

            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);

        }
        int mod = (int) 1e9 + 7;
        long answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = answer + ((i - left[i]) * (right[i] - i) * mod * arr[i] * mod);
            answer = answer % mod;
        }
        return (int) answer;
    }
}
