import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import RomanNumbCalc.AddRomanNumb;

public class AddRomanNumbersTest {
  
  

  @Before
  public void setUp() throws Exception {
    //new AddRomanNumb();
  }

  @Test
  public void test() {
    
    AddRomanNumb addRomanNumb = new AddRomanNumb();
    
    addRomanNumb.setRomanNumber( "III", "III" );
    
    String TestResultat = addRomanNumb.adder();
//        adder("III","III") ;
    
    //fail( "Not yet implemented" );
    // 
    assertEquals("IIIIII", TestResultat);
    //assertEquals("IIIIII", addRomanNumb.adder("III","III") );
    //assertEquals("IIIIII", AddRomanNumb("III","III") );
  }
  
  @Test
  public void testEmptyStrings(){
    
    AddRomanNumb addRomanNumb = new AddRomanNumb();
    
    String TestResultat = addRomanNumb.adder();
    
    assertEquals("", TestResultat);
  }
  

}
