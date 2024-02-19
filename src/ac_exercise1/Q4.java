//4. Write a function that takes in the radius as input and returns the circumference of a circle.

package ac_exercise1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		circumference(radius);

	}
	public static void circumference(double radius) {
		double circumference = (44/7d)*radius;
		System.out.println(circumference);
	}

}

