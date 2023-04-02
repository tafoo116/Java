package review_all;


public class if_statemensts {
	public static void main(String[] args) {

		String sentence = "love" + "love";
		System.out.println(sentence);

		int x = 50;
		int y = 50;
		if (x == y) {
			System.out.println("1");
		} else if (x > y) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		
			
		
		
	System.out.println("==========");
	
	double price = 51.97;
	double tax = 0;
	double shipping = 0;

	if (price >= 0 && price < 50) {
		tax = price * 0.099;
	} else if (price >= 50 && price < 100) {
		tax = price * 0.105;
	} else {
		tax = price * 0.128;
	}
	System.out.println( price);
	System.out.println(tax);
	
    int xx = 5;
    int yy = 10;
    int zz = ++xx + (--yy + ++xx / 2) + 3;
    
    System.out.println("x = " + xx);
    System.out.println("y = " + yy);
    System.out.println("z = " + zz);
    
   //  create an int call it age and assign value 35
   // create a boolean preCondition and assign value false   
   // create the logic as if the age is less than 18 and precondition is false
   // then print "0$ extra should be added"
   // if the age is between 19-30 and there is no pre condition then print "$50 should be added"
   // if the age is between 19-30 and the precondition is true, then print "$85 should be added"
   // if the age is higher than 30, dont worry about pre condition, print "$99 should be added"
    
    
System.out.println("----------------==");
    int age = 12;
    boolean precontion= false;
    if (age<18) {
    	System.out.println("0$ extra should be added");
    }
    else if (age >19 && age<30 ) {
    	System.out.println("$50 should be added");
    }
    else if (age >19 && age<30 && precontion == true) {
    	System.out.println("$85 should be added");
    }
    else if (age >30) {
    	System.out.println("99");
    }
	
    // for prices between 0 - 49 = the tax rate is 9.9%
    // for prices between 50 - 99 = the tax rate is 10.5%
    // for prices between 100 and more = the tax rate is 12.8%
    
    double prize = 100;
    double taz = 0;
    double shippin = 0;
    
    if (prize > 0 && prize <=49 ) {
    	taz = prize * 0.099;
    }
    else if (prize >=50 && prize <=99) {
    	taz = prize * 0.105;
    }
    else if (prize >=100) {
    	taz = prize *0.128;
    	
    }
    System.out.println("prize :" + prize);
    System.out.println("taz :" + taz);
    System.out.println();
    

	int amount = 32;
	double total = 19.99;
	boolean membership = true;
	double shippingCost = 0;
	double taxAmount = 0;

	if (membership) {
		shippingCost =0;
	}else  {
		if (amount < 20) {
			shippingCost = 10;
		}else if (amount >= 20 && amount < 50) {
			shippingCost = 15 ;
		}else if(amount > 51) {
			shippingCost = 25;
		}
	}
	System.out.println("Amount :" + amount);
	System.out.println("shippingcost :" + shippingCost);
	
   String nam= "ioeo veimv vemiv";
   System.out.println(nam.substring(3,7));
   System.out.println(nam.charAt(3));
   System.out.println(nam.length()); 
   System.out.println(nam.endsWith("ver")); 
   
	System.out.println("------new-----------");
   
	
	
	}
}
