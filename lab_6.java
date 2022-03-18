import java.util.Random;
import java.util.Scanner;

	public class lab6 {
	public static void main(String[]args) {
	
		int num, index_1=1,index_2=index_1 +1,index_3=index_2 +1,index_4=index_3 +1,index_5=index_4 +1,index_6=index_5 +1,index_7=index_6 +1;
	    String  day_1="Monday", day_2="Tuesday", day_3="Wednesday", day_4="Thursday", day_5="Friday", day_6="Saturday", day_7="Sunday";
	
	Random rnd = new Random();
	Scanner scan=new Scanner(System.in);String ans;
	
		do {
			System.out.print("Which service would you like to use?\n\t[1]: Basic week visualizer\n\t[2]: Advanced week visualizer\n\t[3]: Basic calculator\n\t[4]: Employee repertoire\n");
			num=scan.nextInt();
			
	while(num<1||num>4)
				{System.out.println("Please make sure you pick a number between 1 and 4");
			num=scan.nextInt();}
	
	switch(num) {
	
	case 1:
		System.out.print("The basic days of the week are: "+day_1+" "+day_2+" "+day_3+" "+day_4+" "+day_5+" "+day_6+" "+day_7);
	break;
	
	case 2:
		System.out.print("The advanced days of the week are: "+index_1+":"+" "+day_1+","+"\n"+index_2+":"+" "+day_2+","+"\n"+index_3+":"+" "+day_3+","+"\n"+
	index_4+":"+" "+day_4+","+"\n"+index_5+":"+" "+day_5+","+"\n"+index_6+":"+" "+day_6+","+"\n"+index_7+":"+" "+day_7+".");
	break;
	
	case 3:
		Calculator value=new Calculator();
	System.out.println(value.toString());
	break;
	
	case 4:
		int insertions = rnd.nextInt(10) +1;
		Employee[] employee = new Employee[insertions];

		
		System.out.println("You have " + insertions + " insertions left.");
		
		for (int i = 0; i < insertions; i++){

		employee[i] = new Employee();

		System.out.println("You have " + (insertions - (i +1)) + " insertions left.");
		break;
		}
	}
	
	System.out.println();
	 System.out.println("Would you like to perform another operation? (y/n)"); 
	 ans=scan.next();
	 }
		while(ans.equalsIgnoreCase("y"));
	}
}


	


