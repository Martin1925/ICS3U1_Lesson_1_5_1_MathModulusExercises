class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {

    int intMinutes;
    int intDays;
    int intHours;

    int intLeftOverMinutes;
    
    // Number of Minutes
    intMinutes = readInt("How many minutes?: ");

    // Conversion to Days, Hours, Minutes
    intDays = intMinutes/(1440);
    intLeftOverMinutes = intMinutes % 1440;

    intHours  = intLeftOverMinutes/60;
    intLeftOverMinutes = intLeftOverMinutes % 60;
   
    // Output of Value
    System.out.println (intDays + " days " + intHours + " hours " + intLeftOverMinutes + " minute(s).");
  }
}