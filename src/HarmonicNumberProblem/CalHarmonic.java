package HarmonicNumberProblem;

import java.util.Scanner;

public class CalHarmonic {

	int input;

	void CalculateHarmonic() {
		double number = 0;

		for (double i = 1; i <= input; i++) {
			number = number + 1 / i;
		}
		System.out.println(number);
	}

	void Input() {
		System.out.println("Enter the Harmonic Number");
	}

	public static void main(String[] args) {

		CalHarmonic num = new CalHarmonic();
		Scanner scan = new Scanner(System.in);
		num.Input();
		num.input = scan.nextInt();
		num.CalculateHarmonic();
		scan.close();

	}
}