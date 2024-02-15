
import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 0; i < t; i++){
            int n = scn.nextInt();
            int count = 0;
            for(int div = 2; div <= Math.sqrt(n); div++){
                if(n % div == 0){
                    count++;  // there is no need to divide the number till n 
                    //if the first no divides after 1 then break the loop
                    break; 
                }
            }
            if(count == 1){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
        scn.close();
    }
}


// import java.util.*;
// public class prime {
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int t = scn.nextInt();
//         for(int i = 0; i < t; i++){
//             int n = scn.nextInt();
//             int count = 0;
//             for(int j = 1; j <= n; j++){
//                 if(n % j == 0){
//                     count++;
//                 }
//             }
//             if(count == 2){
//                 System.out.println("prime");
//             }else{
//                 System.out.println("not prime");
//             }
//         }
//         scn.close();
//     }
// }

