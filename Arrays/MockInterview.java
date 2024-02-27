package Arrays;

import java.util.Scanner;

public class MockInterview {

    public static String generateRoll(String input) {
        String answer = "";
        for (int i = 0; i < input.length(); i += 2) {

            char c1 = input.charAt(i);
            char c2 = input.charAt(i + 1);

            char out = (char) Math.max(c1, c2);
            answer += out;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String answer = generateRoll(input);
        System.out.println(answer);
    }
    
}