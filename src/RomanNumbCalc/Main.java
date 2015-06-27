package RomanNumbCalc;

import RomanNumbCalc.AddRomanNumb;

public class Main {
  //variabler
  static String firstTest;

  public static void main( String[] args ) {

    // første test suit
    /*
    AddRomanNumb testOne = new AddRomanNumb( "III", "III" );
    testOne.adder();
    System.out.println(testOne);*/
    
    //anden test suit
    /*
    AddRomanNumb testTwo = new AddRomanNumb( "", "" );
    testTwo.adder();
    System.out.println(testTwo);*/
    
    //3de test suit
    AddRomanNumb testThree = new AddRomanNumb( "LLXX", "XVVI" );
    testThree.adder();
    System.out.println(testThree);
    
    //4de test suit
    AddRomanNumb testFour = new AddRomanNumb( "MMMMDCCCI", "CLXXXXVIIII" );
    testFour.Nulstil();
    testFour.adder();
    System.out.println(testFour);
    
    //5th test suit
    AddRomanNumb testFive = new AddRomanNumb( "III", "II" );
    testFive.Nulstil();
    testFive.adder();
    System.out.println(testFive);
    
    //6th test suit
    AddRomanNumb testSix = new AddRomanNumb( "V", "V" );
    testSix.Nulstil();
    testSix.adder();
    System.out.println(testSix);
    
    //7th test suit
    AddRomanNumb testSeven = new AddRomanNumb( "XXX", "XX" );
    testSeven.Nulstil();
    testSeven.adder();
    System.out.println(testSeven);
    
    
    //output, er det en reference?
    //RomanNumbCalc.AddRomanNumb@659e0bfd

    // Bliver det her kørt?
    //firstTest = AddRomanNumb.adder();// Hvorfor kan den ikke tilgås?
    
//    if (RomanTwo != null)
//      if(RomanTwo != null)  
//        System.out.println(firstTest);
//      else
//        System.out.println("Mangler indput!");
//    else
//      System.out.println("Mangler indput!");
    
    //AddRomanNumb( "III", "III" );
    
    //System.out.println(AddRomanNumb.adder());

  }
  
}