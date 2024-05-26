public class CheckIfAnrrayIsSorted {

    public static void main(String[] args) {
        int[] arrayInput = {1,3,5};
        int[] arrayInput1 = {1,3,3};
        System.out.println(sorted(arrayInput,0));
        System.out.println(sorted(arrayInput1,0));
    }

    public static boolean sorted(int[] array, int currIndex) {
        if (currIndex == (array.length - 1)) {
            return true;
        }
        if (array[currIndex] < array[currIndex + 1]) {
            //array is sorted
            return sorted(array, currIndex + 1);
        } else {
            return false;
        }
    }
}
