package classes.day14_methods;

public class Task4_PrimeNumbers {

	public static void main(String[] args) {

		System.out.println(isPrime(11));
		System.out.println(isPrime(0));
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(4));
		System.out.println(isPrime(11_456));

	}

	public static boolean isPrime(int num) {

		if (num==0 || num==1) {
			return false;
		} else {
			for (int i=2; i<num; i++) {
				if (num%i==0) {
					return false;
				}
			}
		}
		
		return true;
	}

}
