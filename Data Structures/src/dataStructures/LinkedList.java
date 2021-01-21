package dataStructures;

import java.io.*;



//Java program to implement a simply linked list(without generics)
public class LinkedList {

	Node head; // head of the list

	static class Node {
		int data;
		Node next;

		// Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// *************** INSERTION ****************

	// Method to insert a new node at the end of a linked list
	public static LinkedList insert(LinkedList list, int data) {

		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	//insert the given data at the given position
	public static LinkedList insertByElementAndPosition(LinkedList list, int data, int index) {
		Node new_node = new Node(data);
		new_node.next = null;
		
		if (index < 1) {
			System.out.println("Invalid position");
		}
		
		if (index == 1 && list.head != null ) {
			new_node.next = list.head;
			list.head = new_node;
		}else {
			Node currNode = list.head, prev = null;
			int counter = 1;
			while (counter < index) {
				prev = currNode;
				currNode = currNode.next;
				
				if (currNode == null) {
					break;
				}
				counter++;
			}
			new_node.next = currNode;
			prev.next = new_node;
			
		}
		
		return list;
	}
	
	
	
	
	
//  *************** TRAVERSAL ****************

	// Method to traverse through linked list
	public static void traverse(LinkedList list) {

		Node current_node = list.head;

		while (current_node != null) {

			System.out.print(current_node.data + " ");

			current_node = current_node.next;

		}
		System.out.println();
	}

//  *************** DELETION ****************

	public static LinkedList deleteByKey(LinkedList list, int key) {

		Node currNode = list.head, prev = null;

		// if the key is the data in the head node
		if (currNode != null && currNode.data == key) {

			list.head = currNode.next;
			return list;
		}

		// if the key is at some other position except the head position
		while (currNode != null && currNode.data != key) {

			prev = currNode;
			currNode = currNode.next;

		}
		if (currNode != null) {

			prev.next = currNode.next;

			System.out.println("Key found and deleted " + key);

		}

		// if the key is not in the list, then currNode should be null
		if (currNode == null) {
			System.out.println("Key is not found in the list");
		}

		return list;
	}

	// Method to delete a node in the Linked list by POSIITON
	public static LinkedList deleteAtPosition(LinkedList list, int index) {

		Node currNode = list.head, prev = null;

		if (index == 0 && currNode != null) {
			list.head = currNode.next;

			System.out.println(index + " position element deleted");
			return list;
		}

		// If the index is greater than 0 but less than the size of LinkedList
		// The counter
		int counter = 0;
		while (currNode != null) {

			if (counter == index) {
				prev.next = currNode.next;

				System.out.println(index + " position element deleted");
				break;
			} else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}

			if (currNode == null) {
				System.out.println(index + " element not found");
			}
		}

		return list;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list = insert(list, 0);
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);

				
		traverse(list);
		LinkedList list2 = insertByElementAndPosition(list, 9, 1);
		traverse(list2);
		
		LinkedList list3 = insertByElementAndPosition(list2, 8, 4);
		traverse(list3);

	}

}
