package Strings;
import java.io.*;
import java.util.Scanner;

public class UsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("") ;

        for(char i ='a'; i <= 'z'; i++){
            sb.append(i);
        }
        
        Character sc = 'h';
        
        int index = sb.indexOf(sc.toString());
        System.out.println(index + " " + (char)index);
        System.out.println(sb);
    }
}
