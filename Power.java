class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {

    double dblBase;
    double dblExponent;
    double dblPower;
    
    // Value of base and exponent
    dblBase = readDouble("What is the base value?: ");
    dblExponent = readDouble("Base to the power of?: ");

    // Power of base value
    dblPower = Math.pow(dblBase, dblExponent);

    // Answer
    System.out.println(dblBase + " to the power of " + dblExponent + " is " + dblPower);
  }
}