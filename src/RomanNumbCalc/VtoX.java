package RomanNumbCalc;

public class VtoX {
  private String Ver;
  private static int antalVer;

  public VtoX(String Ver) {
    // TODO Auto-generated constructor stub
    this.Ver = Ver;
  }
  
  public VtoX(VtoX kopi){
    this(kopi.Ver);
  }
  
  public static void Adder(int antal){
    if((antalVer+antal)>=2 )
      antalVer+=antal;
    else
      System.out.println("mer end 2 Ver");

  }

}
