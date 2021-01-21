package dataStructures;

//Array implementation of stack
public class StackWithArray {

	private static final int max = 10;
	private static int top;
	private static int[] stack = new int[max];
	
	StackWithArray()
	{
		top = -1;
	}
	
	//Check if the stack is empty
	public static boolean isEmpty() {
		return (top < 0);
	}
	
	//Push the data onto the stack
	public static boolean push(int data) {
		if(top >= (max - 1)) {
			System.out.println("Stack Overflow...");
			return false;
		}else {
			stack[++top] = data;
			System.out.println(data + " pushed into stack...");
			return true;
		}
	}
	
	//pop the element from the stack
	public static int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow....");
			return -1;
		}
		else {
			int data = stack[top];
			top = top - 1;
			System.out.println(data + " popped out...");
			return data; 
		}
	}
	
	//peek the top element of the stack
	public static int peek() {
		if(isEmpty()) {
			System.out.println("Stack Underflow...");
			return -1;
		}else {
			int data = stack[top];
			System.out.println("Stack head : " + data);
			return data;
		}
	}
	
	//display all the elements of the stack
	public static void display() {
		if (isEmpty()) {
			System.out.println("Stack Underflow...");
		}else {
			for(int i = top; i >= 0; i-- ) {
				System.out.print(stack[i] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		StackWithArray stack = new StackWithArray();
		
		StackWithArray.push(5);
		StackWithArray.push(6);
		
		StackWithArray.peek();
		
		StackWithArray.display();
		
		StackWithArray.pop();
		StackWithArray.display();
		
		StackWithArray.pop();
		StackWithArray.display();
		
	}
}
