//The following programe asks the user to enter a year and the the program determines whether the year is a leap year or not a leap year
//importation of the scanning options
import java.util.Scanner;
//creation of the class leap year
 public class leapyear{
//The main method to run the programe
	public static void main(String[]args){
//calling in the scanning functions
Scanner input = new Scanner(System.in);
//initialization of my variables

	int year;
	int num=4;
	
//prompting the user to enter the year
System.out.println("Enter the year");
 year=input.nextInt();

//The boolean to check whether the year is a leap year then printing the required statement if its attained
	
if(year%num == 0)
{
	System.out.println("This year is a leap");
}
else
{
	System.out.println("This year is not a leap year!");
}

 }
}