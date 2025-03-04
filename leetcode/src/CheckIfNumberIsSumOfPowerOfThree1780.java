public class CheckIfNumberIsSumOfPowerOfThree1780 {
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12));
    }

    public static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
