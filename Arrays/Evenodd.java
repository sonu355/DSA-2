import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < size; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]);
            }
        }
        scn.close();
    }
}
