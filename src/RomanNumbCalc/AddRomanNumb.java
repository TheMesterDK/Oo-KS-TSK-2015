package RomanNumbCalc;

public class AddRomanNumb {
  // Yoda: "Do or do not, there is no try"
  public String RomanOne;
  public String RomanTwo;
  public String Resultat;
  
  
  
  
  public AddRomanNumb(String One, String Two){
    //return RomanOne+RomanTwo;
    this.RomanOne = One;
    this.RomanTwo = Two;
  }
  
  public void setRomanNumber(String One, String Two){
    this.RomanOne = One;
    this.RomanTwo = Two;
  }
  
  public AddRomanNumb() {
    // TODO Auto-generated constructor stub
    
  }

  //get
  public String adder(){//String  One, String Two){
    return RomanOne+RomanTwo;
  }
  
  

}
