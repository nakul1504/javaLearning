package dataStructures;

//Implementation of queue with the help of array
public class QueueWithArray {

	private static int front, rear, capacity;
	private static int queue[];
	
	public QueueWithArray(int c){
		
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}
	
	//function to insert an element at the rear of the queue
	public static void queueEnqueue(int data) {
		
		//Check if the queue is full 
		if(rear == capacity) {
			System.out.println("Queue is full...");
		}else {
			queue[rear] = data;
			rear++;
		}
	}
	
	//function to delete an element from the front of the queue
	public static void queueDequeue() {
		
		//Check if the queue is empty
		if(front == rear) {
			System.out.println("Queue is empty...");
		}else {
			for(int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		}
	}
	
	//Display all the elements of the queue
	public static void display() {
		if(front == rear) {
			System.out.println("Queue is empty...");
		}
		
		for(int i = front; i < rear; i++) {
			System.out.print(queue[i] + "  ");
		}
	}
	
	//print the front of the queue
	public static void queueFront() {
		if(front == rear) {
			System.out.println("Queue is empty");
		}
		System.out.println("Front element is : " + queue[front]);
	}
	
	public static void main(String[] args) {
		
		QueueWithArray q = new QueueWithArray(4);
		
		//Access the elements in a static way
		QueueWithArray.display();
		
		QueueWithArray.queueEnqueue(5);
		QueueWithArray.queueEnqueue(8);
		QueueWithArray.queueEnqueue(9);
		
		QueueWithArray.display();
		
		//Access the elements in a non static way
//		q.queueFront();
//		q.queueDequeue();
//		q.queueFront();
//		
//		q.display();
	}
}
