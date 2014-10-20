/**
*  Calculates the grade a student receives on an examination
*
*  The program first prompts the user to enter the number of points possible
*  on the exam.  Then, the program prompts for the number of items missed; if a positive
*  number is entered, the program responds by calculating and displaying the percentage
*  score out of 100.  If a negative number is entered, the program prints a "Thank You" message
*  and exits.
*  
*  A sample interaction might be: (user input marked with '>')
*  "Enter the number of items on the exam"
*  >25
*  "Enter the number of items missed"
*  >3.5
*  "Missing 3.5 results in a score of 86.0"
*  "Enter the number of items missed"
*  >0
*  "Missing 0 results in a score of 100.0"
*  "Enter the number of items missed"
*  >-100
*  "Thank you -- have a great day!"
*  
*  Manu Gualandri - 20/10/2014
*/
import java.util.Scanner;

public class Grader {
  
  public static void main(String[] args) {
  Scanner scnr = new Scanner(System.in);
  double numPointsPossible = 0.0;
  double numPointsMissed = 0.0;
  double score = 0.0;
  
  System.out.println("Enter the number of points on the exam.");
  numPointsPossible = scnr.nextDouble();
  while (numPointsMissed >= 0) {
  System.out.println("Enter the number of points missed or a negative number to exit.");
  numPointsMissed = scnr.nextDouble();
  score = ((numPointsPossible - numPointsMissed)/numPointsPossible) * 100;
   if (numPointsMissed == 1) {
  System.out.println("By missing " + numPointsMissed + " point, the score is " + score + "%");
  }else if (numPointsMissed < 0) {
  System.out.println("Thank you, see you later!");
  }else if (numPointsMissed > numPointsPossible) {
  System.out.println("Error. What you typed is bigger than the number of points possible.");
  }else {
  System.out.println("By missing " + numPointsMissed + " points, the score is " + score + "%");
  }
  }
  
  return;
  }
  
}
