package Queue;

import List.Node;

public class StructureQueue {
		Node front, rear;
	 boolean isEmpty () {
			return (front == null);
		}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if( isEmpty() ) {
			front = newNode;
			rear = newNode;
		} else {
			rear.setNext(newNode);
			rear = newNode;
		}
	}
	
	public void dispose(Node temp) {
		 temp.setNext(null);
		 temp = null;
	 }
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.print("List kosong");
		}else {
			Node temp = front;
			front=front.getNext();
			dispose(temp);
		}
		
	}
	
	public int size() {
		int size = 0;
		Node curNode = front;
		while ( curNode != null ) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}
	
	public int front() {
		return front != null ? front.getData() : 0;
	}
	
	void displayElement() {
		Node curNode;
		curNode=front;
		if(isEmpty()) {
			System.out.print("Queue Kosong");
		}else {
			while(curNode!=null) {
				System.out.print(curNode.getData()+" ");
				curNode=curNode.getNext();
			}
			System.out.println();
		}
	}
}
