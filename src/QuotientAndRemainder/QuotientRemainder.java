package QuotientAndRemainder;

import java.util.Scanner;

public class QuotientRemainder {
	int dividend = 0, divisor = 0;
	float quotient = 0, remainder = 0;

	void UserInput() {
		System.out.println("Enter the Dividend and Divisor");
	}

	void Calculation() {

		quotient = dividend / divisor;
		remainder = dividend % divisor;
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);

	}

	public static void main(String[] args) {
		QuotientRemainder Obj = new QuotientRemainder();
		Scanner scan = new Scanner(System.in);
		Obj.UserInput();
		Obj.dividend = scan.nextInt();
		Obj.divisor = scan.nextInt();
		Obj.Calculation();
		scan.close();
	}
}