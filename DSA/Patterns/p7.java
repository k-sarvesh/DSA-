//     1
//    212
//   32123
//  4321234
// 543212345
  

import java.util.*;

public class p7{
    public static void main(String[] args){
        int n = 5;
        for(int row = 1; row<=n;row++){
             
            if(row <= n){
                for(int spa = 0; spa < n-row ;spa++){
                        System.out.print(" ");
                    }
                for(int col = row;col >= 1 ; col--){
                System.out.print(col);
            }
            for(int col = 2;col <= row;col++){
                System.out.print(col);
            }
            System.out.println();
            }
         
            }
            
        }
     
}