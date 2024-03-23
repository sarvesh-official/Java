package DojoProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LetterDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digits: ");
        String digits = scanner.nextLine();
        List<String> result = letterCombinations(digits);
        for (String combination : result) {
            System.out.print(combination + " ");
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(0, digits, "", digitToLetters, combinations);
        return combinations;
    }

    private static void backtrack(int index, String digits, String currentCombination, Map<Character, String> digitToLetters, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(currentCombination);
            return;
        }
        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);
        for (char letter : letters.toCharArray()) {
            backtrack(index + 1, digits, currentCombination + letter, digitToLetters, combinations);
        }
    }
}
