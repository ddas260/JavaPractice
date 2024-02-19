/*Print
      *****
     ***** 
    *****
   *****
  *****
 Pattern*/

package ac_patternQuestionsSolutions;

public class Pattern11 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			// to print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// to print 5 stars in each line
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
