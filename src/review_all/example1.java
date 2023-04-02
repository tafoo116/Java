package review_all;

public class example1 {
 
//     	 interview
//		 this is the function that take a string , it takes the first and last char of each word
//		 this is a test
//		 ts is a tt

	 public static String SpecialFormater (String str) {
		 
		 String oo= "";
		 String [] words =str.split ("");
		 for (String s : words) {
			 System.out.println(s);
			
		}
		 
		 
		 
		 return oo;
		 
	 }
		
		public static void main(String[] args) {
			
		String name= "have fun life is short";
	System.out.println(SpecialFormater(name));
		
			
		
		}
		
		
		
		
	

}
