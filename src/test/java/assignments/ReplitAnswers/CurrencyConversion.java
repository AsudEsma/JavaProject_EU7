package assignments.ReplitAnswers;

public class CurrencyConversion {

	public static double convertC(String[][] money,String[][] convertionRate) {
	    // write your code here
	  double sumDollar = 0.0;
	  for(int i=0; i<money.length; i++) {
		  sumDollar += Double.parseDouble(money[i][1])*Double.parseDouble(convertionRate[i][1]);  
	  }

	  return sumDollar;
	  }
	  
	public static void main(String[] args) {
	     
	String[][] test_money =
	{
			{"mark","5"},
			{"shekel","30.5"},
	};
	     
	String[][] test_convert=
	{
			{"mark","1"},
			{"shekel","0.5"},
	};
	     
	double res = convertC(test_money,test_convert);
	System.out.print(res);
	
	}
}
