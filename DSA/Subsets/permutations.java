import java.util.*;
import java.io.*;

public class permutations{
    public static void main(String[] args){
        ArrayList<String> ans = Permutation("","abc");
        System.out.println(ans);
    }
    static ArrayList<String> Permutation(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(Permutation(f+ch+s,up.substring(1)));

        }
        return ans;
    }
}