import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array : ");
        for(int i = 0; i < size; i++){
            arr[i] = scn.nextInt();
        }
        // int[] arr = {2, 4, 3, 6};
        int prod = 1;
        for (int i = 0; i < arr.length; i++){
            prod *= arr[i];
        }
        System.out.println("Product of the array is " + prod);
        scn.close();
    }
}
