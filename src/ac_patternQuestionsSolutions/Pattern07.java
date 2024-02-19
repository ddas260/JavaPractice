/*Print
  12345
  1234
  123
  12
  1 
 Pattern*/

package ac_patternQuestionsSolutions;

public class Pattern07 {
	// Solution #1
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}
	// Solution #2
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n-i+1; j++) {
//				System.out.print(j);
//			}
//			System.out.print("\n");
//		}
//
//	}

}
