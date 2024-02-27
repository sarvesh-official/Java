package Strings;
import java.io.*;
import java.util.Scanner;


public class ShortestPath {
    
    public static float getShortestPath(String path){
        int x = 0 , y =0;
        for(int i = 0 ; i < path.length();i++){

            if(path.charAt(i) == 'E'){
                x++;
            }
            else if(path.charAt(i) == 'W'){
                x--;
            }
            else if(path.charAt(i) == 'N'){
                y++;
            }
            else if(path.charAt(i) == 'S'){
                y-- ;
            }
        }
        int XSquare = x * x;
        int YSquare = y * y;

        return (float)Math.sqrt(XSquare +  YSquare);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }    
}
