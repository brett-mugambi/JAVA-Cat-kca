//This programe is supposed to find the area of a triangle where the program prompts the user to enter the base and height of the triangle  and then the programme finds the area and displays the result
//importation of the utility scanner

import java.util.Scanner;

//creation of the class called Triangle

public class Triangle {

//initialization of my variables

    double base = 0, height = 0;

//using the non static methods to prompt the user to enter the base and height of the triangle called getDimensions

    private void getDimensions() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base:");
        base = input.nextDouble();

        System.out.println("Enter the height:");
        height = input.nextDouble();
    }

//using the non static method to compute the area of the triangle called getComputedArea

    private double getComputedArea() {
        double area = 0.5 * base * height;
        return area;
    }

//display the area of the computed area

    private void display() {
        double computedArea = getComputedArea();
        System.out.println("The area is: " + computedArea);
    }


//create the objects in the main string

    public static void main(String[] args) {
        Triangle recObj = new Triangle();
        recObj.getDimensions();
        recObj.display();
    }
}
