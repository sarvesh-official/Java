// Pattern Printing

// public class javaBasic {
// public static void main(String[] args) {
// System.out.println("****");
// System.out.print("***\n");
// System.out.print("**\n");
// System.out.print("*\n");
// }
// }

// Variable in Java

// public class javaBasic {
// public static void main(String[] args) {
// int a = 10;
// int b = 20000;
// String name = "Tony Stark";
// System.out.println(a + b + name);

// a = 40;
// System.out.println(a + b + name + 20);
// }
// }

// Data Types in Java

// public class javaBasic {

// public static void main(String[] args) {

// // Byte
// byte b = 8;
// System.out.println(b);

// // Char
// char ch = 'a';
// System.out.println(ch);

// // Boolean
// boolean result = true;
// boolean result1 = false;
// System.out.println(result);
// System.out.println(result1);

// // Float
// float price = 13.5f;
// int number = 10;
// System.out.println(price);
// System.out.println(number);

// // Double & short
// double simpele = 10.4;
// short idk = 10000;
// }
// }

// Addition using Java

// import java.util.*;

// public class javaBasic {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// // Includes space between Words
// String input = sc.nextLine();

// System.out.println(input);

// // Doesn't include spaces
// String input2 = sc.next();
// System.out.println(input2);

// // To get Integer Input
// int number = sc.nextInt();
// System.out.println(number);

// // To get Integer Input
// float number2 = sc.nextFloat();
// System.out.println(number2);
// }
// }

// import java.util.*;

// public class javaBasic {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();

// int b = sc.nextInt();

// int Sum = a + b;

// System.out.println(Sum);

// }
// }

// Mulipilication using Java

// import java.util.*;

// public class javaBasic {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the Value of A: ");
// int a = sc.nextInt();
// System.out.println("Enter the Value of B: ");
// int b = sc.nextInt();

// int product = a + b;

// System.out.println("The Output = " + product);

// }

// }

// Finding Area of Circle using Java

// import java.util.*;

// public class javaBasic {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the Radius of the Circle");
// Float radius = sc.nextFloat();
// Float Area = 3.14F * (radius * radius);
// System.out.println("Area of Circle = " + Area);

// }
// }

// Type Conversion

// Byte --> Short --> Int --> Long --> Double

// Type Casting

// import java.util.Scanner;

// public class javaBasic {

// public static void main(String[] args) {
// float a = 14.3f;
// int $ = (int) a;
// Scanner sc = new Scanner(System.in);
// String input = sc.nextLine();
// System.out.println("You entered the character: " + $);
// }
// }

// Unary Operator

// ? Pre Increment - ++a
// ! Pre Decrement - --a
// * --> Update the new value then Use the Updated value

// ? Post Increment - a++
// ! Post Decrement - a--
// * --> Use the previous value then Update the new value

// public class javaBasic {

// public static void main(String[] args) {

// int a = 10;
// int b = a++;

// System.out.println(a);
// System.out.println(b);

// }
// }

// ? Logical Operators
// * &&
// * ||
// * !
// public class javaBasic {

// public static void main(String[] args) {
// int x = 2, y = 5;

// int exp2 = (x * (y / x));

// System.out.println(!(2 <= -2 || 2 == 3));
// System.out.println(exp2);
// }
// }

// ? if , else if and else in Java

// public class javaBasic {

// public static void main(String[] args) {

// int age = 16;
// if (age >= 18) {
// System.out.println("You can Drive");
// } else if (age == 16) {
// System.out.println("You are a teenager you can't drive");
// } else {
// System.out.println("You can't Drive");

// }
// }
// }

// ? Ternary Operator in Java

// * */ Odd or Even

// import java.util.*;

// public class javaBasic {

// public static void main(String[] args) {
// System.out.println("Enter a integer value: ");

// Scanner sc = new Scanner(System.in);

// String odd = (sc.nextInt() % 2 == 0) ? "even" : "odd";

// System.out.println(odd);

// }
// }

// * Check the Student is Pass or Fail
// import java.util.*;

// public class javaBasic {

// public static void main(String[] args) {
// System.out.println("Enter a integer value: ");

// Scanner sc = new Scanner(System.in);

// String pass_or_fail = (sc.nextInt() >= 33) ? "PASS" : "FAIL";

// System.out.println(pass_or_fail);

// }
// }

// Switch Case

// import java.util.*;

// public class javaBasic {

// public static void main(String[] args) {
// int number = 3;

// switch (number) {
// case 2:
// System.out.println("hi");
// break;
// case 3:
// System.out.println("hello");
// break;
// default:
// break;
// }

// }
// }

// ? While Loop in Java

// import java.util.*;

// public class javaBasic {

// public static void main(String[] args) {
// int i = 20;
// while (i < 100) {
// System.out.println("Enter a integer value: " + i);
// i++;
// }
// }
// }

// ? For Loop

// import java.util.*;

// public class javaBasic {

// public static void main(String[] args) {

// for (int i = 0; i < 100; i++) {
// System.out.println("Enter a integer value: " + i);

// }
// }
// }

// ? Printing Square Pattern

// import java.util.Scanner;

// public class javaBasic {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of rows: ");
// int lines = sc.nextInt();
// for (int i = 0; i < lines; i++) {
// System.out.println("****");
// }
// }
// }

// ? Number in Reverse Order

// import java.util.Scanner;

// public class javaBasic {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the number to reverse");
// int input = sc.nextInt();

// String output = "";
// while (input > 0) {

// int lastDigit = input % 10;
// input = input / 10;
// output += lastDigit;

// }
// System.out.println(output);
// }
// }

// ? Do While Loop in Java

// public class javaBasic {

// public static void main(String[] args) {
// int counter = 1;
// do {
// System.out.println("Hello World");
// counter++;
// } while (counter <= 10);
// }
// }

// Break Statement

// public class javaBasic {

// public static void main(String[] args) {

// for (int i = 0; i < 5; i++) {
// if (i == 3)
// break;

// System.out.println("Hello World");
// }
// }
// }

// Continue Statement

// public class javaBasic {

// public static void main(String[] args) {

// for (int i = 1; i < 5; i++) {
// if (i == 3)
// continue;

// System.out.println(i);
// }
// }
// }

// Print whether a number is prime or not

import java.util.*;

public class javaBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int input = sc.nextInt();
        Boolean isPrime = true;
        if (input == 2) {
            System.out.println("The number is prime");
            isPrime = false;
        } else {

            for (int i = 2; i <= (Math.sqrt(input)); i++) {
                if (input % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == false) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }

    }
}