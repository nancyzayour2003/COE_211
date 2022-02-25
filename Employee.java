
public class Employee {
	private String FirstName, LastName;
	private int Age;
	private double Salary;
	
	public Employee(String name, String familyname, int age, double monthsalary) {
		FirstName=name;
		LastName=familyname;
		Age=age;
		Salary=monthsalary;
	}
	
	public 	String toString() {
		return "Employee information: "+FirstName+" "+LastName+", "+Age+", "+Salary;
	}
}
