public class Maxmin{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 65, 22 };
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
    }
}