class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intHours;
    int intDays;
    int intRemainingHours;

    // How many hours
    intHours = readInt("How many hours: ");

    // How many days and hours left
    intDays = intHours/24;
    intRemainingHours = intHours % 24;

    // Output of Value
    System.out.println(intHours + " = " + intDays + " days and " + intRemainingHours + " hours");
  }
}