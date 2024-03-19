package Strings;


public class Intern {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.intern();
        System.out.println(str2);
    }
}
