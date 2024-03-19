package Strings;
import java.io.*;
import java.util.Scanner;

public class SubString {


    public static String GiveSubString(String str1, int si , int ei){

        String SubStr = "";
        for(int i = si; i < ei; i++){
            SubStr += str1.charAt(i);
        }

        return SubStr;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter the String: ");
            String  str1 = sc.nextLine();

            
            System.out.println("Enter the Starting Index(included): ");
            int si = sc.nextInt();
            System.out.println("Enter the Ending Index(excluded): ");
            int ei = sc.nextInt();

            // ^ User-made Function
            System.out.println(GiveSubString(str1,si,ei));

            // ^ Inbuild Function
            System.out.println(str1.subSequence(si, ei));

    }
}
