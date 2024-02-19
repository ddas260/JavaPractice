//1. Enter 3 numbers from the user & make a function to print their average.


package ac_exercise1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sum(num1, num2, num3);

	}

	public static void sum(int num1, int num2, int num3) {
		int avg = (num1 + num2 + num3) / 3;
		System.out.println(avg);
	}

}
