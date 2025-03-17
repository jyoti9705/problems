import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }
    public static boolean divideArray(int[] nums) {
        if(nums == null || nums.length % 2 != 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num: map.keySet()){
            if (map.get(num) % 2 != 0){
                return false;
            }
        }
        return true;



    }
}
