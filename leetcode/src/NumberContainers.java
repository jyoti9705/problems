import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class NumberContainers {
    Map<Integer, SortedSet<Integer>> numberToIndex;
    Map<Integer,Integer> indexToNumber;
    public NumberContainers() {
        numberToIndex = new HashMap<>();
        indexToNumber= new HashMap<>();
    }

    public void change(int index, int number) {
        if(indexToNumber.containsKey(index)){
            int prevNumber = indexToNumber.get(index);
            numberToIndex.get(prevNumber).remove(index);
        }

        indexToNumber.put(index,number);
        SortedSet<Integer> ss = numberToIndex.getOrDefault(number,new TreeSet<>());
        ss.add(index);
        numberToIndex.put(number,ss);

    }

    public int find(int number) {
       if(numberToIndex.containsKey(number) && !numberToIndex.get(number).isEmpty()){
            return numberToIndex.get(number).first();
       }
       return -1;

    }
}
