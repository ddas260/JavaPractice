/*Print
  *      *
  **    **
  ***  ***
  ********
  ********
  ***  ***
  **    **
  *      *
 Pattern*/

package ac_patternQuestionsSolutions;

public class Pattern10 {

	public static void main(String[] args) {
		int n = 4;
		// First half
		for (int i = 1; i <= n; i++) {
			// for first part with stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// for second part with spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// for last part with stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Second half
		for (int i = n; i >= 1; i--) {
			// for first part with stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// for second part with spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// for last part with stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
