package Recrusion;

class RemoveDuplicates {

    public static void RemoveIt(String input, StringBuilder str, boolean[] arr, int idx) {

        if (idx == input.length()) {
            System.out.print(str);
            return;
        }
        
        char currString = input.charAt(idx);

        if (arr[currString - 'a'] == true) {
            RemoveIt(input, str, arr, idx + 1);
        }
        else {
            arr[currString - 'a'] = true;
            str.append(currString);
            RemoveIt(input, str, arr, idx + 1);
            
        }
   }
    public static void main(String[] args) {
        
        String input = "ssaarrvveesshh";

        // StringBuilder str = new StringBuilder("");

        boolean arr[] = new boolean[26];

        RemoveIt(input,new StringBuilder(""),new boolean[26],0);
    }
}