import javax.swing.*;
public class Number
{
    public static void main(String [] args)
    {
        String s;
        int a, b, c;
    
        s=JOptionPane.showInputDialog("enter the value of a\n");
        a=Integer.parseInt(s);
        s=JOptionPane.showInputDialog("enter the value of b");
        b=Integer.parseInt(s);
        c=b+a;
        JOptionPane.showMessageDialog(null, "the answer is %d" + c);

    }
}