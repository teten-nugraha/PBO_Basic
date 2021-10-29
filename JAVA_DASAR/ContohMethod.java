package JAVA_DASAR;

public class ContohMethod {
  public static void main(String[]args) {

    System.out.println("Kode ini ada di block main");

    ContohMethod object = new ContohMethod();
    object.mencobaMethod();
  }

  public void mencobaMethod() {
    System.out.println("Kode ini ada di block mencobaMethod()");
  }
}
