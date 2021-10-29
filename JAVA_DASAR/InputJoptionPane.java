package JAVA_DASAR;

import javax.swing.JOptionPane;

public class InputJoptionPane {
  public static void main(String[]args) {
    String nama = JOptionPane.showInputDialog("Siapa nama kamu ? ");
    System.out.println("Nama kamu adalah "+nama);
  }
}
