import java.util.Arrays;

public class MajorityLength {
    public static void main(String[] args) {

    }

    //    public int majorityElement(int[] nums) {
//        Map<Integer, Long> numMap = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        for (Map.Entry<Integer, Long> entry : numMap.entrySet()
//        ) {
//            if (entry.getValue() > nums.length / 2) {
//                return entry.getKey();
//            }
//
//        }
//        return 0;
//    }
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}
