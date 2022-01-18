package classes.day15_methods;

public class MethodOverLoading {

	public static void main(String[] args) {

	System.out.println(sum(2,3));
	System.out.println(sum(2,4,3));
	System.out.println(sum(2,1,35,36));
	System.out.println(sum(125,14));

	}
	
	public static int sum (int a, int b) {
		return a+b;
	}
	public static int sum (int a, int b, int c) {
		return a+b+c;
	}
	public static int sum (int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	/***** 6 RULES *****
	 
	1- Number of parameters
		add(int,int)
		add(int,int,int)
	2-Data Type of Parameters
		add(int,int)
		add(int,float)
		
	3- Sequence of data type parameters
		add(int,float)
		add(float,int)
		
	4- Invalid Case - not overloading
		int add(int,int)
		float add(int,int)
		
	5-Main Method
		public static void main(String[] args){}
		public static void main(String args){}
		public static void main(){}
	6-Type Promotion
	  6.1
		public static void sum(int a,long b){}
		public static void sum(int a,int b,int c){}
		sum(20,20); //second argument will be promoted to long
	  6.2
		public static void sum(int a,int b){}
		public static void sum(long a,long b){}
		sum(20,20);
	 6.3
		public static void sum(int a,long b){}
		public static void sum(long a,int b){}
		sum(20,20); //error
	*/
}
