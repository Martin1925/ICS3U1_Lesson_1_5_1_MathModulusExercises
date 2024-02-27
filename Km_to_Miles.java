
class Km_to_Miles extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {

    double dblKm;
    double dblMiles;
    
    // Value of Kilometers
    dblKm = readDouble("How many Km were traveled: ");

    // Converstion of Km to Miles
    dblMiles = dblKm * 0.621371;

    // Output of Value
    System.out.println(dblKm + " km = " + dblMiles + " miles.");
  }
}