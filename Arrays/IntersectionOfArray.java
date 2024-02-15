import java.util.HashSet;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 5};
        int[] b = {10, 5, 4};
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int x: a){
            set.add(x);
        }
        for(int x: b){
            if(set.contains(x)){
                count++;
                set.remove(x);
            }
        }
        System.out.println(count);
    }
}
