
package PPP;

/**
 * Laser BeamsBank
 */
public class LaserBeamsBank {

    public static int NumberOfBeams(String[] bank) {
        
        int total = 0;

        int prev = 0;

        for (String row : bank) {
            int curr = 0;
            for (int i = 0; i < row.length(); i++) {
                
                if (row.charAt(i) == '1') {
                    curr++;
                }

            }
            if (curr > 0) {
                total += (prev * curr);
                prev = curr;
            }
        }

        System.out.println(total);
        return total;
    }

    public static void main(String[] args) {

        String[] bank = { "011001","000000","010100","001000" };

        NumberOfBeams(bank);
    }
    
}