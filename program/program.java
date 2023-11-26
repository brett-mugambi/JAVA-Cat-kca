public class program {

  // initialization of the instance variable
  private int number;

  // the constructor
  public program(int num) {
    number = num;
  }

  // non-static method
  public void printNumber() {
    System.out.println("Number: " + number);
  }

  // static method 1
  public static void printMessage() {
    System.out.println("This is my java assignment");
  }

  // static method 2
  public static int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public static void main(String[] args) {
    // create an object of Program
    program example = new program(5);

    // call the non-static method
    example.printNumber();

    // call the static methods
    printMessage();
    int result = multiply(3, 4);
    System.out.println("Result: " + result);
  }
}
