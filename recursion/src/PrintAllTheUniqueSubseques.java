import java.util.HashSet;
import java.util.Set;

public class PrintAllTheUniqueSubseques {
    public static void main(String[] args) {
        String inputString = "aabb";
        Set<String> stringSet = new HashSet<>();
        uniqueSubsequences("", inputString, 0,stringSet);


    }
    public static void uniqueSubsequences(String newString,String inputString,int idx,Set<String> stringSet){
        if (idx == inputString.length()) {
            if (!stringSet.contains(newString)) {
                stringSet.add(newString);
                System.out.println(newString);
            }
            return;

        }

        char currChar = inputString.charAt(idx);

        //to be
        uniqueSubsequences(newString + currChar, inputString, idx + 1,stringSet);

        //not to be
        uniqueSubsequences(newString, inputString, idx + 1,stringSet);
    }
}
