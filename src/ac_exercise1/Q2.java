//2. Write a function to print the sum of all odd numbers from 1 to n.

package ac_exercise1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		oddSum(num);

	}

	public static void oddSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}

}
