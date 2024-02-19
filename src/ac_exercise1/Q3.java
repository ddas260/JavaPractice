//3. Write a function which takes in 2 numbers and returns the greater of those two.

package ac_exercise1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		maxNum(num1, num2);

	}

	public static void maxNum(int num1, int num2) {
		num1 = (num1 > num2) ? num1 : num2;
		System.out.println(num1);

	}

}
