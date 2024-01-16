package Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static int Search(int key, int[] numbers) {

        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 1, 10, 2, 3, 4, 5 };
        System.out.println("Enter the Key to Find: ");
        int key = sc.nextInt();

        int result = Search(key, numbers);

        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element is not present");

        }
    }
}
