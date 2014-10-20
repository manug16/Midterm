/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <Manu Gualandri>
 * @version <20/10/2014>
 */
import java.util.Scanner;

public class PizzaPalace {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
   int numPeople = 0;
   int numSlicesPerPerson = 0;
   int numSlicesPerPizza = 0;
   double numPizzas = 0.0;
   System.out.println("How many people are in the club?");
   numPeople = scnr.nextInt();
   System.out.println("How many slices of pizza is each person allowed?");
   numSlicesPerPerson = scnr.nextInt();
   System.out.println("How many slices are there in each pizza?");
   numSlicesPerPizza = scnr.nextInt();
   numPizzas = (numPeople * numSlicesPerPerson)/numSlicesPerPizza;
   System.out.println("The number of pizzas required is " + Math.ceil(numPizzas) + ".");
   
   return;
	}

}
