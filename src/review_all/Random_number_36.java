package review_all;

import java.util.Random;
import java.util.Scanner;

public class Random_number_36 {

	public static void main(String[] args) {

		
//		Goal : learn how to genrate a random num whiten a range. Specific num
		
		Random ra = new Random();
		System.out.println(ra.nextInt(6)+ 10);	
		System.out.println(ra.nextInt(6)+ 10);	
	
//		(end - start +1)+Start ___ 
//		10 -15 / -- 15-10+1 =6
//		(6)+10
		
    
		int s= 2;
		int e= 8;
		int ran = ra.nextInt(e - s +1) + s;
		System.out.println(ra.nextInt(e - s +1) + s);
		System.out.println(ra.nextInt(e - s +1) + s);
		System.out.println(ra.nextInt(e - s +1) + s);
//		this is the way we write the hole number
	

		System.out.println("----example ---");
		
		
//		create a random number in  range 48-89
		
		int first = 48;
		int sec = 89;
		
		int se = ra.nextInt(sec - first + 1)+ first;
		System.out.println(ra.nextInt(sec- first+1)+first);
		System.out.println(ra.nextInt(sec- first+1)+first);
		
		
		
//		
//		
//		Game __video 37 _ at the end
		
		
		
//		 optional question to work on in the break
//		 create two ints start and end to define a range
//		 generate a random number in the range
//		 create scanner and ask the user to enter a number in the console
//		 check to see if the number entered matched the random number that was created
//		 if the number matched, say congrats
//		 if the number was smaller than the random number, say go up!
//		 if the number was bigger than the random number, say go down!
//		 give 3 chances to guess the value that was generated
//		 good luck :)
		
		

		int start = 0;
		int end = 10;
		Random r = new Random();
		
		int rNum = r.nextInt(end - start +1) + start ;
		Boolean guessed = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Random " + rNum);
		System.out.println(" please rang is from " + start + " to " + end + "!");
		System.out.println(" please guess a value whiten the range : ");
		
		
		int g1 = sc.nextInt();	
		System.out.println("first ENtry : " + g1);
		if (rNum == g1 ) {
			System.out.println(" Gussed right ! The Valu Was " + rNum);
		}else if ( g1 > rNum) {
			System.out.println(" Go down !");
		}else {
			System.out.println(" go up !");
		}
		
		 {
		int g11 = sc.nextInt();	
		System.out.println("Secund ENtry : " + g11);
		if (rNum == g11 ) {
			System.out.println(" Gussed right ! The Valu Was " + rNum);
		}else if ( g11 > rNum) {
			System.out.println(" Go down !");
		}else {
			System.out.println(" go up !");
				
		
		
		
	    if (guessed == false) {
		int g12 = sc.nextInt();
		System.out.println(" threed entry :"+ g12);
		if ( g12 == rNum) {
			System.out.println(" guessed right the value was :" + rNum);
		}else System.out.println(" game over ; the value was :" + rNum);
		      System.out.println(" good luck next time ");
		
		
		
	
		
		
		
		
		
	}

}}}}
