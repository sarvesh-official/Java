package PPP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SherlockAndValidStrings {

    public static String isValid(String s) {
        
        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char c : s.toCharArray()) {

            if (frequency.containsKey(c)) {
                int value = frequency.get(c);

                frequency.put(c, value + 1);
            } else {
                frequency.put(c, 1);
            }

        }
        
        ArrayList<Integer> freqValues = new ArrayList<>(frequency.values());


        // Sorting the values ex : [1,2,2,2,2]

        Collections.sort(freqValues);



        int sizeOfList = freqValues.size();

        //^ Checking if all the frequencies are same
        if (freqValues.get(0) == freqValues.get(sizeOfList - 1)) {
            return "YES";
        }

        //* */ Checking if the lowest value is 1 if so we can remove it so that the final characters will have same frequencies
        if (freqValues.get(0) == 1 && freqValues.get(1) == freqValues.get(sizeOfList - 1)) {
            return "YES";
        }

        //! Checking if the largest value can be decreased by 1 so that all the characters will have same frequencies
        if (freqValues.get(0) == freqValues.get(sizeOfList - 2)
                && freqValues.get(sizeOfList - 2) == (freqValues.get(sizeOfList - 1) - 1)) {
            return "YES";
        }

        else {
            return "NO";
        }

    }
    
    public static void main(String[] args) {
         System.out.println(isValid("aabbcd"));           // Output: NO
        System.out.println(isValid("aabbccddeefghi"));   // Output: NO
        System.out.println(isValid("abcdefghhgfedecba"));// Output: YES
    }
}
