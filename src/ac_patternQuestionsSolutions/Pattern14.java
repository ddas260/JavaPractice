/*Print
     *
    ***
   *****
  *******
  *******
   *****
    ***
     *
 Pattern*/

package ac_patternQuestionsSolutions;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
