import java.util.*;
import java.io.*;

public class subset{
    public static void main(String[] args){
        Subsets("","abc");
    }
    static void Subsets(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        Subsets(p+ch,up.substring(1));
        Subsets(p,up.substring(1));
    }

}