package classes.day38_inheritance;

public class companyTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor ct = new Contractor();
		
		emp.calculatePay(40, 40);
		ft.calculatePay(40, 40);
		ct.calculatePay(40, 40);

	}

}
