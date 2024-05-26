import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ElementOccuringOnce {
    public static void main(String[] args) {

    }

    static int singleElement(int[] arr, int N) {
        Map<Integer, Integer> map = new HashMap<>();
        // code here
        for (Integer n : arr
        ) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
        ) {
            int n = entry.getValue();
            if (n == 1) {
                return entry.getKey();
            }

        }
        return 0;
    }

    static int singleElement2(int[] arr, int N) {
        Arrays.sort(arr);
        int i=0;
        while (i<N-1){
            if(arr[i]==arr[i+1]){
                i=i+3;
            }else {
                return arr[i];
            }
        }
        return 0;
    }
}
