package RomanNumbCalc;

public class AddRomanNumb {
  // Yoda: "Do or do not, there is no try"
  public static String RomanOne;
  public static String RomanTwo;
  public static String Resultat;
  public String FinalResult;
  public static String Ier;
  public static String Ver;
  public static String Xer;
  public static String Ler;
  
  // set konstuktor
  public AddRomanNumb(String One, String Two){
    //return RomanOne+RomanTwo;
//    if (RomanTwo != null)
//      if(RomanTwo != null)  
//        System.out.println(firstTest);
//      else
//        System.out.println("Mangler indput!");
//    else
//      System.out.println("Mangler indput!");
    AddRomanNumb.RomanOne = One;
    AddRomanNumb.RomanTwo = Two;
  }
   
//  public void setRomanNumber(String One, String Two){
//    this.RomanOne = One;
//    this.RomanTwo = Two;
//  }
  
  public AddRomanNumb(AddRomanNumb kopi) {
    this(AddRomanNumb.RomanOne, AddRomanNumb.RomanTwo);
  }

  //get
  public static String adder(){//String  One, String Two){
    Resultat = RomanOne+RomanTwo;
    
    for(int i=0;i<Resultat.length();i++) {
      char tegn = Resultat.charAt( i );
      if(tegn =='I')
        System.out.println("1Ier");
    }
    Counter(Resultat);
    return RomanOne+RomanTwo;
  }
  
  public static void Counter(String RomanString){
    
    for(int i=0;i<Resultat.length();i++) {
      char tegn = Resultat.charAt( i );
      if(tegn =='I')
        // add I til Ier
        Ier("I");
        //System.out.println(i+"I");
      else if(tegn =='V')
        // add V til Ver
        //System.out.println(i+"V");
        Ver("V");
      else if(tegn =='X')
        // add X til Xer
        //System.out.println(i+"X");
        Xer("X");
      else if(tegn =='L')
        //System.out.println(i+"L");
        Ler("L");
      else if(tegn =='C')
        System.out.println(i+"C");
      else if(tegn =='D')
        System.out.println(i+"D");
      else if(tegn =='M')
        System.out.println(i+"M");
    }
  }
  
  public static void Ier(String I){
    if(Ier==null)
      Ier="";
    switch(Ier){
      case "":
        Ier = "I";
        break;
      case "I":
        Ier += "I";
        break;
      case "II":
        Ier += "I";
        break;
      case "III":
        Ier += "I";
        break;
      case "IIII":
        Ier ="";
        Ver("V");
        break;
    }
    
  }
  
  public static void Ver(String V){
    System.out.println("Ver");
    if(Ver==null)
      Ver="";
    switch(Ver){
      case "":
        Ver = "V";
        break;
      case "V":
      //  Ver += "V";
       // break;
     // case "VV":
        Ver = "";
        Xer("X");
        break;
    }
  }
  
  public static void Xer(String X){
    System.out.println("Xer");
    if(Xer==null)
      Xer="";
    switch(Xer){
      case "":
        Xer = "X";
        break;
      case "X":
        Xer += "X";
        break;
      case "XX":
        Xer += "X";
        break;
      case "XXX":
        Xer += "X";
        break;
      case "XXXX":
        Xer = "";
        Ler("L");
        break;
    }
  }
  
  public static void Ler(String L){
    System.out.println("Ler");
    if(Ler==null)
      Ler="";
    switch ( Ler ) {
      case "":
        Ler = "L";
        break;
      case "L":
        Ler = "LL";
        break;
      case "LL":
        Ler= "";
        //Cer("C");
        break;
      //default:
      //  break;
    }
  }
  
  public void Nulstil(){
    Ier ="";
    Ver = "";
    Xer = "";
    Ler = "";
  }
  
  public String MakeResult(){
    FinalResult="";
    //for(int l=0;l<=Resultat.length();l++){
      //for(int i=0;i<Ier.length();i++)
        //FinalResult += "I";
    //}
      FinalResult = Ier + Xer + Ver + Ler;
    return FinalResult;
  }
  

  public String toString() {
    return "AddRomanNumb [RomanOne=" + RomanOne + ", RomanTwo=" + RomanTwo + ", Resultat=" + Resultat + "]"+
  "[antal Ier:"+Ier+" antal Ver:"+Ver+" antal Xer:"+Xer+" antal Ler:"+Ler+"]";
  } 
}