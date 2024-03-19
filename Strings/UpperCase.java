package Strings;
import java.io.*;
import java.util.Scanner;

public class UpperCase {

    public static String ConvertToString(String input){
        StringBuilder sc = new StringBuilder("");

        sc.append(Character.toUpperCase(input.charAt(0)));

        for(int i = 1 ; i < input.length();i++){

            if(input.charAt(i) == ' ' && i < (input.length() - 1)){

                sc.append(input.charAt(i));
                i++;
                sc.append(Character.toUpperCase(input.charAt(i)));
            }
            else{
                sc.append(input.charAt(i));
            }
        }
        return sc.toString();
    }
    public static void main(String[] args) {
        
        String input = "hello i am sarvesh";

        System.out.println(ConvertToString(input));
    }
}
