import javax.swing.*;
import javax.swing.JOptionPane;

public class Switchdemo{
  public static void main(String[] args) {
    String s;
    int choice;

 do
 {
  s=JOptionPane.showInputDialog("com\n"+"ACS\n"+"BIT\n");
  choice=Integer.parseInt(s);
  switch (choice)
  {
    case 1:
    JOptionPane.showMessageDialog(null,"com");
    break;

    case 2:
    JOptionPane.showMessageDialog(null, "ACS");
    break;

    case 3:
    JOptionPane.showMessageDialog(null, "BIT");
    break;

    default:
    JOptionPane.showMessageDialog(null, "chose from the ABOVE");
    break;

  }
  }

  while (choice!=3);
   
  }
}