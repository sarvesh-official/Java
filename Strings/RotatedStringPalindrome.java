package Strings;

import java.util.*;


public class RotatedStringPalindrome {

    public static boolean isRotatedPalindrome(String s) {

        System.out.println(s.substring(0) + s.substring(0,0));
        return true;
    }
    public static void main(String[] args) {
        
        String input = "aab";

         if (isRotatedPalindrome(input)) {
            System.out.println("Yes, the rotated string is a palindrome.");
        } else {
            System.out.println("No, the rotated string is not a palindrome.");
        }

    }
}
