import java.util.*;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 5};
        int[] b = {10, 5, 4};

        HashSet<Integer> set = new HashSet<>();
        for(int x: a){
            set.add(x);
        }
        for(int x: b){
            set.add(x);
        }
        System.out.println(set);
    }
}
