import javax.swing.*;

public class Numbersquare {
    public static void main(String[] args) {
        JTextArea p = new JTextArea();
        int n;
        
        // Append the headers with proper spacing and a newline
        p.append("Number\tSquare\tCube\n");
        
        // Loop through numbers from 0 to 20
        for (n = 0; n <= 20; n++) {
            p.append(n + "\t" + (n * n) + "\t" + (n * n * n) + "\n");  // Add a newline after each row
        }
        
        // Display the JTextArea inside a JOptionPane
        JOptionPane.showMessageDialog(null, p);
    }
}
