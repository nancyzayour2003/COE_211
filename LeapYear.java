import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		        int year;
		    Scanner scan=new Scanner(System.in);
		System.out.println("Enter a year(after 1582): ");
		    year=scan.nextInt();
		     if (year<1582)
		    {
		        System.out.println("Please enter a year after 1582");
		        year=scan.nextInt();
		    } 
		    while (year % 4 != 0 || year % 100 == 0 && year % 400 != 0){
		        System.out.println("This year is not a leap year, enter another one: ");
		            year=scan.nextInt();        
		    }
		    System.out.println("This year is a leap year!");
		   
		    
		    }
	}


