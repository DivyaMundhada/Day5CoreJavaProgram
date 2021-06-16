package Swap2Numbers;

import java.util.Scanner;

public class Swap {
	int temp = 0, num1 = 0, num2 = 0;

	void UserInput() {
		System.out.println("Enter the numbers to swap: ");
	}

	void SwapNumber() {
		System.out.println("The numbers before swapping are " + num1 + " and " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("The numbers after swapping are " + num1 + " and " + num2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Swap numbers = new Swap();
		numbers.UserInput();
		numbers.num1 = scan.nextInt();
		numbers.num2 = scan.nextInt();
		numbers.SwapNumber();
		scan.close();
	}
}
