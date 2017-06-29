import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

//Test for numbers divisible by 4
@Test
public void isLeapYear_forNumberDivisibleByFour_true() {
 LeapYear leapyear = new LeapYear();
 assertEquals(true, leapyear.isLeapYear(2012));
}
//Test for numbers not divisible 4
@Test
public void isLeapYear_forNumberNotDivisibleByFour_false() {
  LeapYear leapyear  = new LeapYear();
  assertEquals(false, leapyear.isLeapYear(1990));
}

//Test for numbers not divisible by 100
@Test
public void isLeapYear_forNumberDivisibleByHundred_false() {
  LeapYear leapyear = new LeapYear();
  assertEquals(false, leapyear.isLeapYear(1900));
}

@Test
public void isLeapYear_forNumberDivisibleByFourHundred_true() {
  LeapYear leapyear = new LeapYear();
  assertEquals(true, leapyear.isLeapYear(2000));
}


//Test if its divisible by 400
}
