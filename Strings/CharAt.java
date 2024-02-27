package Strings;

import java.io.*;
import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = new String("Hi");

        System.out.println(str.charAt(0)); // Prints the 0th element

        String fromUser = sc.next();

        System.out.println(fromUser);


        for(int i = 0 ; i < fromUser.length();i++){
            System.out.println(fromUser.charAt(i));
        }
    }
}
