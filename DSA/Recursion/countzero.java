import java.util.*;
public class countzero{
public static void main(String[] args){
System.out.println(count(1050604));
}
static int count(int n){
    int count=0;
    if(n==0){
        return count;
    }
    if(n%10==0){
        count++;
    }
    
    count(n%10);
    
}
}

