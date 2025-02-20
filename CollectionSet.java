
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class CollectionSet {
    public CollectionSet() {
    }

    public static void main(String[] args) {
        setexample setexample = new setexample();
        setexample.listexample();
    }

    public static class setexample {
        public setexample() {
        }

        public void listexample() {
            Set<Integer> set1 = new HashSet();
            set1.addAll(Arrays.asList(1, 2, 3, 5, 6, 8, 0));
            System.out.println("First Set:" + String.valueOf(set1));
            Set<Integer> set2 = new HashSet();
            set2.addAll(Arrays.asList(4, 3, 5, 6, 8, 9));
            System.out.println("Second Set:" + String.valueOf(set2));
            Set<Integer> union = new HashSet(set1);
            union.addAll(set2);
            System.out.println("Union Set:" + String.valueOf(union));
            Set<Integer> intersection = new HashSet(set1);
            intersection.retainAll(set2);
            System.out.println("Intersection Set:" + String.valueOf(intersection));
            Set<Integer> difference = new HashSet(set1);
            difference.removeAll(set2);
            System.out.println("Difference Set:" + String.valueOf(difference));
        }
    }
}
