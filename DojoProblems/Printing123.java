package DojoProblems;

public class Printing123 {
     public static void findPermutation(String str, String ans) {
        
        //! Base Case
        if (str.length() == 0) {
            System.err.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            
            char curr = str.charAt(i);
            
            String newStr = str.substring(0, i) + str.substring(i + 1);

            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        
    }
}
