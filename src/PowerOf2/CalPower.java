package PowerOf2;

import java.util.Scanner;

public class CalPower {
	int input;

	void UserInput() {
		System.out.println("Enter the Power");
	}

	void PowerOfTwo() {
		int i = 1;
		int temp = i;
		for (; i <= input; i++) {
			temp = temp * 2;
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalPower t1 = new CalPower();
		t1.UserInput();
		t1.input = scan.nextInt();
		t1.PowerOfTwo();
		scan.close();
	}
}
