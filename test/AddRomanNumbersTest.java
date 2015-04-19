import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import RomanNumbCalc.AddRomanNumb;

public class AddRomanNumbersTest {

  @Before
  public void setUp() throws Exception {
    new AddRomanNumb();
  }

  @Test
  public void test() {
    fail( "Not yet implemented" );
    assertEquals("IIIIII", Add("III","III") );
    assertEquals("IIIIII", AddRomanNumb("III","III") );
  }

}
