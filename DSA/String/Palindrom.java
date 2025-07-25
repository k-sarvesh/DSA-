import java.util.*;
 
public class Palindrom {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {
        if (str == null) {
            return true;
        }
        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
