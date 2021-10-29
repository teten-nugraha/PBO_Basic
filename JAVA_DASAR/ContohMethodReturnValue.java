package JAVA_DASAR;

public class ContohMethodReturnValue {

  public static void main(String[]agrs) {

    ContohMethodReturnValue object = new ContohMethodReturnValue();

    int panjang =10;
    int lebar=20;
    int luas = object.hitungLuasPersegiPanjang(panjang, lebar);

    System.out.println("Panjang = "+panjang);
    System.out.println("Lebar = "+lebar);
    System.out.println("Luas Persegi Panjang = "+luas);
  }

  public int hitungLuasPersegiPanjang(int panjang, int lebar) {
    int luas = panjang * lebar;
    return luas;
  }

}
