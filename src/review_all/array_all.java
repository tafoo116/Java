package review_all;

public class array_all {
	public static void main(String[] args) {

//		structrue 
//		String name= new String[];

//		Q1
		int[] first = new int[3];
		first[0] = 10;
		first[1] = 3;
		first[2] = 4;
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(first.length);

//		Q2
		int[] years = new int[10];
		int sum = 0;
		years[0] = 1;
		years[1] = 11;
		years[2] = 22;
		years[3] = 33;
		years[4] = 44;
		years[5] = 55;
		years[6] = 66;
		years[7] = 77;
		years[8] = 88;
		years[9] = 99;
		System.out.println(years[1]); // and print all the line

//		the other way that we can write an array :-
//		the other way is more common and usefull at work;
	System.out.println("-----------------");
		int[] now = { 10, 11, 12, 13, 14 };
		
//		if we want to print all use WHILE LOOP
		int i=0;
		while(i<now.length) {
			System.out.println(now[i++]);
			
//			other ways
		System.out.println(now.length);
		System.out.println(now[3]);
		}
		
//		another example 
		System.out.println("---------S--------");
		String [] word= {"lov", "sse", "mce", "mco"};
		System.out.println(word.length);
		int m= 0;
		while(m < word.length) {
			System.out.println(word[m++]);
		}
		
		System.out.println("=========================");
		
//		2dimention of array String 
//		or we can say -  of array string
//		String [][] temp= new String [1][2];
		
		int [][]nums = new int [3][2];
		nums[0][0]= 10;
		nums[0][1]= 11;
		
		nums[1][0]= 2;
		nums[1][1]= 33;
		
		nums[2][0]= 3;
		nums[2][1]= 5;
		System.out.println(nums[2][1]);
		System.out.println("================");
		int [][]numbers= {{1,2,3},{4,5},{6,7,8,9},{10}};
		System.out.println(numbers.length);
//		1  2  3
//		4  5  
//		6  7  8  9
//		10
		System.out.println("----------------------");
//		IF WE Want to write in other way
		int [][]numbers2= new int [4][];
		numbers2 [0]= new int[3];
		numbers2 [1]= new int[2];
		numbers2 [2]= new int[4];
		numbers2 [3]= new int[1];
		
		int[]onee= {1,2,3,4};
		for(int i1 = 0; i1<onee.length ; i1++) {
		System.out.println(onee[i1]);
		}
		
		
		
		
	}

}
