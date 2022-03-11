import java.util.Scanner;
public class lab6 {
public static void main(String[]args) {
	int Age,num,number1,number2,sum,difference,product,quotient,index_1=1,index_2=index_1 +1,index_3=index_2 +1,index_4=index_3 +1,index_5=index_4 +1,index_6=index_5 +1,index_7=index_6 +1;
	double Salary;
	String FirstName, LastName, operator, day_1="Monday", day_2="Tuesday", day_3="Wednesday", day_4="Thursday", day_5="Friday", day_6="Saturday", day_7="Sunday";
	Scanner scan=new Scanner(System.in);
	System.out.print("Which service would you like to use?\n\t[1]: Basic week visualizer\n\t[2]: Advanced week visualizer\n\t[3]: Basic calculator\n\t[4]: Employee repertoire\n");
	num=scan.nextInt();
	if(num==1) {
		System.out.print("The basic days of the week are: "+day_1+" "+day_2+" "+day_3+" "+day_4+" "+day_5+" "+day_6+" "+day_7);
	}
	if(num==2) {
		System.out.print("The advanced days of the week are: "+index_1+":"+" "+day_1+","+"\n"+index_2+":"+" "+day_2+","+"\n"+index_3+":"+" "+day_3+","+"\n"+index_4+":"+" "+day_4+","+"\n"+index_5+":"+" "+day_5+","+"\n"+index_6+":"+" "+day_6+"\n"+index_7+":"+" "+day_7+".");
	}
	if(num==3) {
	System.out.print("Input the first number: "); 
	number1=scan.nextInt();
	System.out.print("Input the operator: ");
	operator=scan.next();
	System.out.print("Input the second number: ");
	number2=scan.nextInt();
		if(operator=="+") {
		sum=number1+number2;
		System.out.print(number1+operator+number2+"="+sum);
		}
		if(operator=="-") {
			difference=number1-number2;
			System.out.print(number1+operator+number2+"="+difference);
			}
		if(operator=="/") {
			quotient=number1/number2;
			System.out.print(number1+operator+number2+"="+quotient);
			}
		if(operator=="*") {
			product=number1*number2;
			System.out.print(number1+operator+number2+"="+product);
			}
	}
	if(num==4) {
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
	else {
		System.out.println("Please make sure you pick a number between 1 and 4");

	}
}
}