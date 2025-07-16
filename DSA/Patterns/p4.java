// 1
// 12
// 123
// 1234
// 12345


import java.util.*;

public class p4{
    public static void main(String[] args){
        int n = 5;
        for(int row = 1; row<=n;row++){
            int count = 1;
            for(int col = 1;col <= row ; col++){
                System.out.print(count );
                count++;
            }
            System.out.println();
        }
    }
}