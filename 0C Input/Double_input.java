//scanner real example

import java.util.Scanner;

public class Double_input
{
 public static void main(String args[])
 {
  Scanner keyboard = new Scanner(System.in);

  System.out.print("Enter a float :: ");
  float flote = keyboard.nextFloat();
  System.out.println(flote);

  System.out.print("Enter a double :: ");
  double dec = keyboard.nextDouble();
  System.out.println(dec);
 }
}
