import javax.swing.*;

public class NumberSq
{
    public static void main(String [] args)
    {
        JTextArea.p = new JTextArea();
        int n;
        p.append("Number\t square\t cube");
        for (n=0; n<=20; n++)
        {
            p.append(n+"\t" + n*n+ "\t" + n*n*n);

        }
        JOptionPane.showMessageDialog(null, p);
    }

}
