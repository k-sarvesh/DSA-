
import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        System.out.println(series(5));

    }
    static int series(int n){
        if(n<2){
            return n;
        }
        return series(n-1)+series(n-2);
    }
    
}