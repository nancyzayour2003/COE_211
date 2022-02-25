import java.util.Scanner;
public class EntryPoint {

	public static void main(String[] args) {
		String FirstName, LastName;
		int Age;
		double Salary;
		Scanner scan =new Scanner(System.in);
		System.out.println("Please input the employee's first name: ");
		FirstName=scan.next();
		System.out.println("Please input the employee's last name: ");
		LastName=scan.next();
		System.out.println("Please input the employee's age: ");
		Age=scan.nextInt();
		System.out.println("Please input the employee's salary: ");
		Salary=scan.nextDouble(); 
		Employee E1=new Employee(FirstName, LastName, Age, Salary); 
		System.out.println(E1.toString());
	}

}
