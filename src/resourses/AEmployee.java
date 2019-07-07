package resourses;

public abstract class AEmployee {
	
	public String id;	
	public String name;
	public double totalhr;
	public double hrate;
	
	public AEmployee(String id, String name, double totalhr, double hrate) {
		this.id = id;
		this.name = name;
		this.totalhr = totalhr;
		this.hrate = hrate;
	}

	public double generateGrossPay() {
		return totalhr * hrate;
	}
	
	public double generateNetPay() {
		return generateGrossPay() - 10;
	
	}
	
	public abstract void hourLimitation();
}

// constructor module name will be the same and no return type so only public. also has a body and its body 
//override is implementing abstract into a body function into my parent abstract class into my abstract child class one & two //