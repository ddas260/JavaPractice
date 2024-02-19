/*Print
      1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1
  (Pascal's triangle)
 Pattern*/

package ac_patternQuestionsSolutions;

public class Pattern19 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print spaces for left alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Initialize the first element of the row as 1
            int value = 1;
            // Print each element of the row
            for (int j = 1; j <= i; j++) {
                // Print the value
                System.out.print(value + " ");
                // Update the value using the formula
                value = value * (i - j) / j;
            }
            // Move to the next i
            System.out.println();
        }
    }
}



