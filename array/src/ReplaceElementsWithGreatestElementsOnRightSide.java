public class ReplaceElementsWithGreatestElementsOnRightSide {
    public static void main(String[] args) {
        int[] arrayInput = new int[]{17, 18, 5, 4, 6, 1};
        int[] response = replaceElements(arrayInput);
        System.out.println(response);
    }

    public static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result[i] = -1;
                break;
            }
            int max = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    result[i] = arr[j];
                }
                max = Math.max(max, arr[j]);
            }
        }
        return result;
    }
}
