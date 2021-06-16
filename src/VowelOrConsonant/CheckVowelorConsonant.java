package VowelOrConsonant;

import java.util.Scanner;

public class CheckVowelorConsonant {
	char alphabet;

	void UserInput() {
		System.out.println("Enter any alphabet: ");
	}

	void Check() {
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
			System.out.println("The alphabet you entered is a vowel");
		else
			System.out.println("The alphabet you entered is a consonant");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CheckVowelorConsonant obj = new CheckVowelorConsonant();
		obj.UserInput();
		obj.alphabet = scan.next().charAt(0);
		obj.Check();
		scan.close();
	}
}
