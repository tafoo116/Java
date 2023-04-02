package review_all;

import java.util.Scanner;

public class scanerrr {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println(" please enter ur first name ");
		String firstname = sc.nextLine();
		System.out.println("Please enter ur last name");
		String lastname = sc.nextLine();
		System.out.println("please confirm the info");
		System.out.println("Your firstname " +firstname + " :   and your last name " + lastname );
		
		sc.close();
		
		
	}
}
