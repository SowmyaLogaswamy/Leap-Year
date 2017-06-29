import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a year to know if it is a Leap year or not");
    int userInputYear = Integer.parseInt(myConsole.readLine());
    LeapYear leapyear = new LeapYear();
    boolean leapYearResult = leapyear.isLeapYear(userInputYear);
    System.out.println("Is that a leap year?" + leapYearResult) ;
  }
}
