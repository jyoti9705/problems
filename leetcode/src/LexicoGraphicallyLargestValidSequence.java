public class LexicoGraphicallyLargestValidSequence {
    public static void main(String[] args) {
        System.out.println("We will be constructing lexico graphically largest valid sequence");
        //Constraints
        // 1 <= n <= 20
        //when constraints are small, we can use backtracking, or recursions or dp
        //input is n
        //lets say n=5, then we need to construct a sequence of 1,2,3,4,5
        //greedy approach will say that use the largest number first and then go on
        //number 1 should be only once in the sequence
        //number 2 to n should be twice in the sequence
        //for every integer i between 2 and n, the distance between the two occurrences of i is exactly i.
        //The distance between two numbers on the sequence, a[i] and a[j], is the absolute difference of their indices, |j - i|.


    }

    public int[] constructDistancedSequence(int n) {
        //with above explained constraints, lets see what will be length of sequence
        //if every number had been twice, then length of sequence would have been 2*n
        //but number 1 is only once, so length of sequence will be 2*n-1
        //so the formula for length of sequence will be 2*n-1
        int[] sequence = new int[2 * n - 1];
        //boolean array to keep track of numbers that are already used
        boolean[] used = new boolean[n + 1];
        backtrack(0, sequence, used, n);


        return sequence;
    }

    private boolean backtrack(int index, int[] sequence, boolean[] used, int n) {
        while (index < sequence.length && sequence[index] != 0) {
            index++;
        }
        if (index == sequence.length) {
            return true;
        }
        for (int i = n; i >= 1; i--) {
            if (used[i]) {
                continue;
            }
            if (i == 1) {
                sequence[index] = 1;
                used[i] = true;
                if (backtrack(index + 1, sequence, used, n)) {
                    return true;
                }
                sequence[index] = 0;
                used[i] = false;
            } else if (index+i<sequence.length && sequence[index+i]==0) {
                sequence[index] = i;
                sequence[index + i] = i;






                used[i] = true;
                if (backtrack(index + 1, sequence, used, n)) {
                    return true;
                }
                sequence[index] = 0;
                sequence[index+i] = 0;
                used[i] = false;
            }

        }
        return false;

    }
}
