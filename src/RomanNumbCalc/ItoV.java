package RomanNumbCalc;

public class ItoV {
  private String Ier;
  private int AntalIer;

  public ItoV(String Ier) {
    // TODO Auto-generated constructor stub
    this.Ier = Ier;
  }
  
  public ItoV(ItoV kopi){
    this(kopi.Ier);
  }
  
  public void Adder(int antal){
    if((AntalIer+antal)>=5)
      for(int i=0;i<antal;i++)
        Ier += "I";
    else{
      VtoX.Adder(1);
      
      }
  }
  
  

}
