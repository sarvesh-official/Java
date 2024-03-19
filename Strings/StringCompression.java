package Strings;

public class StringCompression {

    public static String Compress(String input){
        
        StringBuilder sc = new StringBuilder("");
        int len = input.length();
        for(int i = 0 ; i < len;i++){

            Integer count = 1;
            while (i < len-1 && input.charAt(i) == input.charAt(i+1)) {
                count++;
                i++;
            }

            sc.append(input.charAt(i));
            if(count > 1){
                sc.append(count.toString());

            }

        }
        return sc.toString();
    }
    public static void main(String[] args) {
        String input = "aaabbbccc";
        System.out.println(Compress(input));
    }
}
