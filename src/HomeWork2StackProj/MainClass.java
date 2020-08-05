package HomeWork2StackProj;

import java.util.Scanner;
import HomeWork2StackProj.Stack1;
import HomeWork2StackProj.Stack1.getEvenStack;
import HomeWork2StackProj.Stack1.getMaxStack;
import HomeWork2StackProj.Stack1.getReverseStack;
public class MainClass {	@SuppressWarnings("resource")
public static void main(String[] args) throws CloneNotSupportedException
	{
		
		// Asks the user for the wanted number of elements in his stack
		System.out.println("How many elements would you like in your stack?");
		
		// Scanner definitions
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		// Define stack object
		Stack1 stackObject = new Stack1(n);
		
		// Get the function classes to operate from the resource class
		getReverseStack r = new getReverseStack();
		getMaxStack z = new getMaxStack();
		getEvenStack e = new getEvenStack();
		
		// Display initial empty stack
		stackObject.display();
	
		// Fill the stack with user input
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter the " + i + "th element: ");
			int element = scanner.nextInt();
			stackObject.push(element);
		}
		
		// Display stack after the user filled it
		System.out.println("Your stack: ");
		stackObject.display();
		
		// Reverse the stack and display the reversed stack
		r.reverse(stackObject);
		System.out.println("Reversed stack: ");
		stackObject.display();
		
		// Puts the max value on top of the stack and display after the changes
		z.MaxOnTop(stackObject);
		System.out.println("Max on top stack: ");
		stackObject.display();
		
		// Creates and displays the even numbers only stack 
		e.EvenStackCreate(stackObject);
		System.out.println("Even numbers only stack: ");
		stackObject.display();	
	}
}
