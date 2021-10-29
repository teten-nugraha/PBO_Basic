package JAVA_DASAR;

public class ContohBreakContinue {
  public static void main(String[]args) {
    
    byte jumlah = 5;

    System.out.println("=================");
    System.out.println("Contoh Break");
    for(byte i=0; i <= jumlah; i++){
      if(i == 3) {
        break;
      }
      System.out.println(i+1);
    }

    System.out.println("=================");
    System.out.println("Contoh Continue");
    for(byte i=0; i <= jumlah; i++){
      if(i == 3) {
        continue;
      }
      System.out.println(i+1);
    }
  }
}
