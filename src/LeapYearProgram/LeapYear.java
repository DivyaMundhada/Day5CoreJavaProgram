package LeapYearProgram;

import java.util.Scanner;

public class LeapYear {

int year;
int length;

public void CheckLength() {
	length = (int) Math.log10(year) + 1;
}

public void CheckLeapYear() {

	 if (length == 4 )
        if (year % 4 == 0 )
                if ( year % 100 == 0 )
                        if ( year % 400 == 0 )
                                System.out.println(year + "is a Leap Year");
                        else

                                System.out.println(year + " is not a Leap Year");
                else
                System.out.println(year + " is a Leap Year");
        else
        System.out.println(year + " is not a Leap Year");
	 else
		 System.out.println("Wrong input entered.");
}

public static void main(String[] args) {
        LeapYear Check = new LeapYear();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        Check.year = scan.nextInt();
        Check.CheckLength();
        Check.CheckLeapYear();
scan.close();
}

}


