package payroll;
import resources.Fte;
public class PayrollDepartment {

	
			public static void main(String[] args) {

				Fte emp = new Fte("E001", "MR X","40.00","10.00");
				Fte emp = new Fte("E002", "MR X","40.00","10.00");
				Fte emp = new Fte("E003", "MR X","40.00","10.00");
				Fte emp = new Fte("E004", "MR X","40.00","10.00");

				
				System.out.println(mrx.generateGrossPay());
				System.out.println(mrx.generateNetPay());
				emp.hourLimitation();
				
			}
	}


// static - will make a fixed reference with the class. will always hold the value//

// non static -1.  A non-static method belongs to an object of the class and you have to create an instance of the class to access it. 
			// 2.  Non-static methods can access any static method and any static variable without creating an instance of the class.//

