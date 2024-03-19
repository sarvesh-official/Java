package Strings;
import java.io.*;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String checkStr = sc.nextLine();

        int n = checkStr.length();

        boolean isPalindrome = true;
        for(int i = 0 ; i < checkStr.length(); i++){
            
            if(checkStr.charAt(i) != checkStr.charAt(n - 1 - i)){
                System.out.println("The string is not a palindrome");
                isPalindrome = false;
                return;
            }

        }

        if(isPalindrome){
            System.err.println( "The string is a palindrome" );
        }

    }
}
