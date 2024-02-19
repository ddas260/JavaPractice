/*Print
  *      *
  **    **
  * *  * *
  *  **  *
  *  **  *
  * *  * *
  **    **
  *      *
 Pattern*/

package ac_patternQuestionsSolutions;

public class Pattern15 {

	public static void main(String[] args) {
		int n = 5;
		// first half
		for (int i = 1; i <= n; i++) {
			// for first quarter with stars and spaces
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// for spaces after first quarter
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			// for second quarter with stars and spaces
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// second half
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

