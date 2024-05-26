import java.util.HashSet;
import java.util.Random;

class RandomizedSet {
    public HashSet<Integer> hashSet;
    public Random random;


    public RandomizedSet() {
        hashSet = new HashSet<>();
        random = new Random();

    }

    public boolean insert(int val) {
        if (hashSet.contains(val)) {
            return false;
        }
        hashSet.add(val);
        return true;

    }

    public boolean remove(int val) {
        if (hashSet.contains(val)) {
            hashSet.remove(val);
            return true;
        }
        return false;

    }

    public int getRandom() {
        Integer[] arrayInput = hashSet.toArray(new Integer[hashSet.size()]);
         return arrayInput[random.nextInt(hashSet.size())];

    }
}