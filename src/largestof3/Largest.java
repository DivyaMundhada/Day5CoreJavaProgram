package largestof3;

import java.util.Scanner;

public class Largest {
	int num1, num2, num3;

	void UserInput() {
		System.out.println("Enter the three numbers: ");
	}

	void check() {
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is greatest");
		} else if (num2 > num3) {
			System.out.println(num2 + " is greatest");
		} else {
			System.out.println(num3 + " is greatest");
		}

	}

	public static void main(String[] args) {
		Largest obj = new Largest();
		Scanner scan = new Scanner(System.in);
		obj.UserInput();
		obj.num1 = scan.nextInt();
		obj.num2 = scan.nextInt();
		obj.num3 = scan.nextInt();
		obj.check();
		scan.close();

	}
}
