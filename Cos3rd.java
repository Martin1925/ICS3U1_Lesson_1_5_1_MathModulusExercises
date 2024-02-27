class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblSideC;
    
    // Sidelength Values
    dblSideA = readDouble("What is the value of Sidelength A: ");
    dblSideB = readDouble("What is the value of Sidelength B: ");
    dblAngleC = readDouble("What is the value of the contained angle: ");

    // Finding Hypotenous
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleC)));

    // Output of Values
    System.out.println("The length of side C is " + dblSideC);
    
  }
}