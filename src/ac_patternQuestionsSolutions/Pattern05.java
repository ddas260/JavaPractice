/*Print
     *
    **
   ***
  **** 
 Pattern*/

package ac_patternQuestionsSolutions;

public class Pattern05 {

	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <= n; i++) {
			// to print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// to print stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}

