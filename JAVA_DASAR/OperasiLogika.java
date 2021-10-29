package JAVA_DASAR;

public class OperasiLogika {
  public static void main(String[]args) {
    boolean hasil;
    boolean a  =true;
    boolean b = false;

    hasil = a && b;
    System.out.println("true && false : "+ hasil);

    hasil = a || b;
    System.out.println("true || false : "+ hasil);

    hasil  =!a;
    System.out.println("Negasi dari true adalah : "+ hasil);

  }
}
