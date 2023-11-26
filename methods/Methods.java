//The following code asks the user to input two values where then it determines the largest and smallest numbers entered and gives feedback
//importation of the scanner options in java
import java.util.Scanner;
//create a class named methods

public class Methods{
// the main method to execute the program
  public static void main(String[]args){
//initialization of variables
	int num1;
	int num2;
 	int num3;

Scanner input = new Scanner(System.in);
// prompt the user to enter three numbers num1,num2 and num3

System.out.println("Enter number 1:");
	num1=input.nextInt();

System.out.println("Enter number 2:");
	num2=input.nextInt();

System.out.println("Enter number 3:");
	num3=input.nextInt();
//initialization of the largest and smallest numbers

int largest=num1;
int smallest=num2;

 if (num1 < num2)
	{	
	
		smallest=num2;
	}


 if (num2 < num3)
	{	
		
	largest=num3;
	}
//displaying the results of the smallest and largest numbers

	System.out.println("The Smallest Number is: " + smallest );
		System.out.println("The largest number: " + largest );

		System.out.println( largest  +  " is largest and "  +  smallest  +  " is the smallest number");

 }
}