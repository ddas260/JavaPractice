//5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.


package ac_exercise1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		eligibility(age);
	}

	public static void eligibility(int age) {
		String result = (age > 18) ? "Eligible to vote" : "Not eligible to vote";
		System.out.println(result);
	}

}