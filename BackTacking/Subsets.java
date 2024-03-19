package BackTacking;

public class Subsets {

    public static void findSubSets(String str, String ans, int i) {

        //! base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.err.println(ans);
            }
            return;
        }

        // * Yes Choice
        findSubSets(str, ans + str.charAt(i), i + 1);
        findSubSets(str, ans, i+1);
        
        // ^ No Choice
    }
    public static void main(String[] args) {
        
        String str = "abc";
        findSubSets(str, "", 0);
    }
}
