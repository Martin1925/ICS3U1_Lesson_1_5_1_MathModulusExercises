class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {

    double dblSideA;
    double dblSideB;
    double dblHyp;
    double dblArea;

    // Value of Side Lengths
    dblSideA = readDouble("What is the value of side A: ");
    dblSideB = readDouble("What is the value of side A: ");
    dblHyp = readDouble("What is the value of the Hypotenous : ");

    // Calculate Area
    dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblHyp))) / 2.0;

    // Output of Value
    System.out.println("The area is " + dblArea);
  }
}