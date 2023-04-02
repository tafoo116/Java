package review_all;

public class if_condition_true_false {

	public static void main(String[] args) {
//	    day 35 
//		if condetion the true and false way
//		for simply Q
//		for using small code
//		for using one line code

//		(Condition ) ? true : false;

		int one = 10;
		System.out.println(one > 5 ? "yes" : "no");

//	with if statment	

		if (one > 5) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

//		Example
//		day 35- H(1:20)
		double grade = 85;
			;
		String gradeletter = "";

//		> 95 === A+
//		90-94 == A-
//		85-89 == B+
//		80-84 == B-

		if (grade >= 95) {
			gradeletter = grade >= 95 ? "A+" : "A-";
		} else if (grade >= 80) {
			gradeletter = grade >= 85 ? "B+" : "B-";
		}
		System.out.println("grade" + grade + "  letter	" + gradeletter);
	}

}
