import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> num1Set = new HashSet<>();
        for (int i : nums1
        ) {
            num1Set.add(i);

        }

        for (int i : nums2
        ) {
            if (num1Set.contains(i) && !result.contains(i)) {
                result.add(i);
            }

        }
        int[] fResult = new int[result.size()];
        int startVariable = 0;
        for (Integer i : result
        ) {
            fResult[startVariable] = i;
            startVariable++;

        }
        return fResult;
    }

}
