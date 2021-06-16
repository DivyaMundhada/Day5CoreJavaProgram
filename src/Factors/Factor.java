package Factors;

import java.util.Scanner;

public class Factor {
	int num;
	
	void Factors() {
		for (int i=2; i*i<num; i++) {
			while (num % i == 0) {
				System.out.println(i+" ");
				num = num/i;
			}
		}
		if (num > 2) {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		System.out.println("Please enter a number.");
		Scanner scan = new Scanner(System.in);
		Factor Obj = new Factor();
		Obj.num = scan.nextInt();
		scan.close();
		Obj.Factors();
	}
}