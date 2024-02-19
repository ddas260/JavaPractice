//8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

package ac_exercise1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		pow(x, n);

	}

	public static void pow(int number, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++) {
			result *= number;
		}
		System.out.println(result);
	}

}
