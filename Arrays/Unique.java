import java.util.*;

public class Unique {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 5, 3, 1};
        HashSet<Integer> uniqueEle = new HashSet<>();
        for(int elements : arr){
            uniqueEle.add(elements);
        }
        int sum = 0;
        for(int sumOfEle : uniqueEle){
            sum += sumOfEle;
        }

        System.out.println("Number of distinct element are: " + uniqueEle + " the addition is: " + sum);
    }
}




// import java.util.Scanner;
// public class Unique {
//     public static void main(String[] args) {
//         Scanner scn  = new Scanner(System.in);
//         System.out.println("Enter the size of the array ");
//         int size = scn.nextInt();
//         int[] arr = new int[size];
//         System.out.println("enter the elements of the array");
//         for(int i = 0; i < size; i++){
//             arr[i] = scn.nextInt();
//         }
//         int sum = 0;
//         // int[] arr = {1, 2, 4, 5, 2, 3, 5};
//         for(int i = 0; i < arr.length; i++){
//             int count = 0;
//             for(int j = 0; j < arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }
//             if(count == 1){
//                 sum += arr[i];
//                 System.out.println(arr[i]);
//             }
//         }
//         System.out.println(sum);
//         scn.close(); 
//     }
// }
