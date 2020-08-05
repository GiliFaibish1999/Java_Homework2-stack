package HomeWork2StackProj;

import java.util.ArrayList;
import java.util.Collections;

public class Stack1 {

		// Variable definitions
		private int[] stackArray;
		private int topOfStack;
		public Stack1(int numberOfElements)
		{
			stackArray = new int[numberOfElements];
			topOfStack = -1; 
		}
	

		
		// push an integer element at the top of the stack
		public void push(int element)
		{
			if (isFull()) //  the stack is already full
			{
				System.out.println("Stack is already full!");
			}
			else
			{
				topOfStack++;
				stackArray[topOfStack] = element;
			}
		}

		// remove the element at the top of the stack
		public int pop()
		{
			int response = 0;

			if (isEmpty())
			{
				System.out.println("Stack is already empty!");
			}
			else
			{
				response = stackArray[topOfStack];
				stackArray[topOfStack] = 0;
				topOfStack--;
			}

			return response;
		}

		// check whether the stack is full
		public boolean isFull()
		{

			boolean response = false;

			if (topOfStack == stackArray.length - 1)
			{
				response = true;
			}

			return response;
		}

		// check whether the stack is empty
		public boolean isEmpty()
		{
			boolean response = false;

			if (topOfStack == -1)
			{
				response = true;
			}

			return response;
		}

		// implement a dsiplay method for the stack
		public void display()
		{
			System.out.println("---");
			if (isEmpty())
			{
				System.out.println("Stack is empty!");
			}
			else
			{
				for (int i : stackArray)
				{
					if (i != 0)
					{
						System.out.println(i);
					}
				}
			}
			System.out.println("---");
		}
		
		
		// Reverse stack
		public static class getReverseStack {
		    public void insert_at_bottom(Stack1 stackObject, int x){

		        //check if stack is empty
		        if(stackObject.isEmpty()){
		        	stackObject.push(x);
		            return;
		        }
		        //take out the existing items in stack and keep it in function stack
		        int y = stackObject.pop();
		        //push x to the bottom
		        insert_at_bottom(stackObject, x);

		        //push back all the items from function stack to stack
		        stackObject.push(y);
		    }
		    public void reverse(Stack1 stackObject){
		        if(stackObject.isEmpty()==false){

		            //pop out all the items from the stack and store it in function stack
		            int x = stackObject.pop();
		            reverse(stackObject);

		            //now insert the items into stack in reversed order
		            //last item popped from the stack
		            insert_at_bottom(stackObject, x);
		        }
		    }
		}
		
		// Max on top stack
		public static class getMaxStack {			  
			  public void MaxOnTop(Stack1 stackObject){
				  
				// Stack array list
				java.util.List<Integer> StackEmptyHereList = new ArrayList<>();
				
				// Empty stack to list
				while(stackObject.isEmpty()==false){
					int b = stackObject.pop();
					StackEmptyHereList.add(b);
				}
				
				// Gets max value and brings it to the top oh the list
				int maxOfStack = Collections.max(StackEmptyHereList);
				int index = StackEmptyHereList.indexOf(maxOfStack);
				StackEmptyHereList.remove(index);
				StackEmptyHereList.add(0, maxOfStack);
				
				// Fill stack again with max on top
				for (int k = 0; k < StackEmptyHereList.size() ; k++)
				{
					int c = StackEmptyHereList.get(k);	
					stackObject.push(c);
				}				
			  }
		  }
		
		// Even stack
		public static class getEvenStack {
			public void EvenStackCreate(Stack1 stackObject){
				  
				// Stack array list
				java.util.List<Integer> StackEmptyHereList = new ArrayList<>();
				
				// Even value list
				java.util.List<Integer> EvenValueList = new ArrayList<>();
				
				// Empty stack to list
				while(stackObject.isEmpty()==false){
					int b = stackObject.pop();
					StackEmptyHereList.add(b);
				}
				
				// Fill EvenValueList with even numbers only 
				for (int k = 0; k < StackEmptyHereList.size() ; k++)
				{
					int NumToCheck =  StackEmptyHereList.get(k);
					if ( NumToCheck % 2 == 0 ) {
						EvenValueList.add(NumToCheck);
					}
					else {
						;
					}	
				}
				
				// Fill stack again with even numbers only
				for (int k = 0; k < EvenValueList.size() ; k++)
				{
					int c = EvenValueList.get(k);	
					stackObject.push(c);
				}				
			  }
			}
		}
				  
			  
