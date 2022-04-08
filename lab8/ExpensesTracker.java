package Expenses;
	
	import java.io.File;
	import java.io.PrintWriter;
	import java.io.FileWriter;  // Import the FileWriter class
	import java.io.IOException;  // Import the IOException class to handle errors
	import java.util.Scanner;

	public class ExpensesTracker{
		  public static void main(String[] args) throws IOException{
		      
			  String ans1, ans2, summary, name, purchase;
			  
			  // Create FileWriter & Scanner objects & y/n string
			  File file1=new File("expenses.txt");
			  FileWriter F1=new FileWriter(file1);
			  PrintWriter outputFile=new PrintWriter(F1);
			  Scanner scan=new Scanner(System.in);
			  Scanner scanFromFile=new Scanner(file1);
			  double money;
		      
			  // Start gathering information inside the loop you will start
			  	do {
			    
			  	  System.out.println("Input your name:");
				  name=scan.nextLine();
				  System.out.println("What did you purchase?");
				  purchase=scan.nextLine();
				  System.out.println("How much did you pay(in USD)?");
				  money=scan.nextDouble();
				  scan.nextLine();
				  outputFile.print(name+" purchased "+purchase+" for "+money+" USD dollars."+"\n");
				  
				  System.out.println("Would you like to log another purchase? (y/n)");
				  ans1=scan.next();
				  //scan.nextLine();
			  	}
			  	while(ans1.equalsIgnoreCase("y"));
			  	
				  	if(ans1.equalsIgnoreCase("n")) 
				  	{
				  		System.out.print("Would you like to read a summary of your purchases?");
				  		ans2=scan.next();
				  		F1.close();
				  		if(ans2.equalsIgnoreCase("y"))
				  			 
				  			while(scanFromFile.hasNext())
				  			 {
				  	            summary=scanFromFile.nextLine();
				  	          System.out.println(summary);
				  	            
				  			 }
				  		
				  		else if (ans2.equalsIgnoreCase("n"))
				  			System.out.println("Get off of ZoodMall!");
				  	}
				  
				  
			      // Close ClassWriter & Scanner objects
			        scan.close();
			        scanFromFile.close();
			        
			      // If you have already have a expenses.txt file, you need to delete it
			      // before you compile your code again
				  	
		  }
	}


