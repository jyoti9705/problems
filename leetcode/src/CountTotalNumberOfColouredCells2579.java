/**
 * This class contains a method to count the total number of colored cells.
 */
public class CountTotalNumberOfColouredCells2579 {

    /**
     * Main method to test the coloredCells method.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println(coloredCells(3));
    }

    /**
     * Calculates the total number of colored cells after n iterations.
     *
     * @param n The number of iterations
     * @return The total number of colored cells
     */
    public static long coloredCells(int n) {
        int count = 1; // Initial count of colored cells
        n--; // Decrement n as the first cell is already counted
        while (n > 0) {
            count = count + n * 4; // Add the number of new cells colored in each iteration
            n--; // Decrement n for the next iteration
        }
        return count; // Return the total count of colored cells
    }
}