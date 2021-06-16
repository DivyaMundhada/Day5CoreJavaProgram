package FlipCoinProgram;

import java.util.Scanner;


public class CoinFlip {
	int input;
	int no_of_Head=0;
	int no_of_Tail=0;
	
void UserInput() {
	System.out.println("Enter the number of times you want to flip the coin");
}
void Toss() {
	int i;
	input = Math.abs(input);
	for (i=0;i<input;i++) {
		double Cointoss = Math.random();

		if (Cointoss < 0.5) {
			System.out.println("Tails");
			no_of_Tail++;
		}
		else
		{
			System.out.println("Heads");
			no_of_Head++; }
	}
	
}

void CalPercentage() {
	float Head_Percentage;
	float Tail_Percentage;
	Head_Percentage=((no_of_Head*100)/input);
	Tail_Percentage=((no_of_Tail*100)/input);
	System.out.println("Percentage of Head is " + Head_Percentage + "%");
	System.out.println("Percentage of Tails is " + Tail_Percentage + "%");
}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	CoinFlip t1 = new CoinFlip();
	t1.UserInput();
	t1.input = scan.nextInt();
	t1.Toss();
	t1.CalPercentage();
	scan.close();
}
}
