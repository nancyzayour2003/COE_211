import java.util.*;
public class Bonus {
	public static void main(String[]args) {
		String FirstName, LastName;
		int Age;
		double Salary;
		Random r=new Random();
		int r1=r.nextInt(10-1)+1;
		System.out.print(r);
		for(int i=1; i<=r1 ;i++) {
			System.out.println("You still have "+(r1-i)+" insertions left.");
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Please input the employee's first name: ");
			FirstName=scan.next();
			System.out.println("Please input the employee's last name: ");
			LastName=scan.next();
			System.out.println("Please input the employee's age: ");
			Age=scan.nextInt();
			System.out.println("Please input the employee's salary: ");
			Salary=scan.nextDouble(); 
			Employee E=new Employee(FirstName, LastName, Age, Salary); 
			System.out.println(E.toString());
			
		
		     
	     }		

}
}