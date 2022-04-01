import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private String value;

    public Calculator() {
    	
        Scanner scanCalc = new Scanner(System.in);
        System.out.print("Input the first number: "); 
    	num1=scanCalc.nextInt();
    	System.out.print("Input the operator: ");
    	operator=scanCalc.next();
    	System.out.print("Input the second number: ");
    	num2=scanCalc.nextInt();
    	
    switch(operator)
    	{
    	case "+": add(num1,num2);break;
    	case "/":divide (num1,num2);break;
    	case "-":subtract(num1,num2);break;
    	case "*":multiply(num1,num2);break;
    	}
    }

    public String add(int a, int b) {
    	value=(a+b)+"";
        return value;
    }

    public String subtract(int a, int b) {
    	value=(a-b)+"";
        return value;
    }

    public String multiply(int a, int b) {
    	 value=(a*b)+"";
        return value;
    }

    public String divide(int a, int b) {
    	 value=(a/b)+"";
        return value;
    }
    public String toString() {
    	return num1 +" "+ operator +" "+ num2 +" = "+ value;
    }
}