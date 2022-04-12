package lab_9;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Grades {
    public static void main(String[] args) {
        
    	// Initialize array of integers
    	int[] Grades=new int[5];
    	double average=0, sumOfGrades=0, sumOfLabs=0, midterm=0;
    	int labs, midterm_grade;
    	DecimalFormat dft=new DecimalFormat("0.00");
        
    	// for loop to get user input & store in array
    	Scanner scan=new Scanner(System.in);
    	for(int i=0;i<Grades.length;i++) 
    	{
    		System.out.println("Input the grade of assignment "+(i+1)+":");
    		Grades[i]=scan.nextInt();
    	}
    	
    	System.out.println("Input the number of attended labs: ");
		labs=scan.nextInt();
		System.out.println("Input the midterm grade: ");
		midterm_grade=scan.nextInt();
        scan.close();
		
        // for loop to iterate over the array & perform calculations
			for (int j=0;j<Grades.length;j++)
			{
			sumOfGrades+=Grades[j];
			average=(sumOfGrades/5)*0.3;
			sumOfLabs=(double)labs*100*0.05/7.0;
			midterm=(midterm_grade)*0.3;
			}

        // display output to user
		System.out.println("Assignments(30%):"+dft.format(average)+"\n"+"Attendance(5%):"+dft.format(sumOfLabs)+"\n"+"Midterm(30%):"+dft.format(midterm));
    }
}
    