class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    double dblRadius;
    double dblCircumference;

    // Radius of Circle
    dblRadius = readDouble("What is the radius of your circle? ");

    // Calculate Circumference
    dblCircumference = 2 * Math.PI * dblRadius;

    // Output of Value
    System.out.println("Your circumference is: " + dblCircumference);
    
  }
}