import javax.swing.*;
import java.util.*;
import java.util.Scanner;
public class Sampler{
    public static void main(String [] args)
    {
        Scanner j = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter value of a\n");
        a=j.nextInt();
        System.out.println("enter value b\n");
        b=j.nextInt();
        c = b+a-1;
        System.out.println("The sum of %d"+ c);
    }
}