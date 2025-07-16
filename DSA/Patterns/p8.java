//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1

import java.util.*;

public class p6{
    public static void main(String[] args){
        int n = 5;
        for(int row = 1; row<=2*n-1;row++){
             
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
            else{
                 for(int spa = 0; spa < row -n ;spa++){
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