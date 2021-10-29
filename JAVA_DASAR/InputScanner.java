package JAVA_DASAR;

import java.util.Scanner;

public class InputScanner {
  public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan nama kamu : ");

    String nama = scanner.nextLine();
    System.out.println();
    System.out.println("=======================");
    System.out.println("Nama kamu adalah "+nama);
  }
}
