// *****
// ****
// ***
// **
// *


import java.util.*;

public class p3{
    public static void main(String[] args){
        int n = 5;
        for(int row = n; row>=1;row--){
            for(int col = 1;col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}