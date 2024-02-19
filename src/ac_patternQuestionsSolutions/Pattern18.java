/*Print
  11111
  2222
  333
  44
  5 
 Pattern*/

package ac_patternQuestionsSolutions;

public class Pattern18 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-(i-1);j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
 
}
