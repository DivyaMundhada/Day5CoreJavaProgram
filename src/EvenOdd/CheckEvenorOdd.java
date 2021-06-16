package EvenOdd;

import java.util.Scanner;

public class CheckEvenorOdd {
	int num = 0;

	void UserInput() {
		System.out.println("Enter the numbers: ");
	}

	void EvenorOdd() {
		if (num % 2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CheckEvenorOdd number = new CheckEvenorOdd();
		number.UserInput();
		number.num = scan.nextInt();
		number.EvenorOdd();
		scan.close();
	}
}
