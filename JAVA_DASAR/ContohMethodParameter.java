package JAVA_DASAR;

public class ContohMethodParameter {
  public static void main(String[]args) {
      
    byte  nilai = 56;

    ContohMethodParameter object = new ContohMethodParameter();
    object.cariRanking(nilai);
  }

  public void cariRanking(byte nilai) {
    if(nilai >= 80) {
      System.out.println("Nilai kamu Bagus");
    }else if(nilai >= 60) {
      System.out.println("Nilai kamu Cukup");
    }else{
      System.out.println("Nilai kamu Kurang");
    }
  }

}
