package QueueSimpleCircularArray;

public class StructureQueue {
		private int N = 5;
	    private String[] queue = new String[N]; // index 4
	    private int front = -1;
	    private int rear = -1;
	    
	    public boolean isEmpty() {
	        return front == rear;
	    }	

	    public boolean isFull() {
	        return (rear + 1) % N == front;
	    }

	    public void enqueue(String antrean) {
	    	if(front == -1 && rear == -1) {
	    		front = rear = 0;
	    		queue[rear] = antrean;
	    	}else if (isFull()) {
	    		System.out.println("Antrean Bioskop Penuh.");
	        }else {
	        	rear = (rear + 1) % N;
	        	queue[rear] = antrean;
	        }
	    }

	    public void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Antrean Bioskop Kosong.");
	        }else {
	        	front = (front + 1) % N;
	        }
	    }

	    public String getFront() {
	    	String value = null;
	        if (isEmpty()) {
	            System.out.println("Antrean Bioskop Kosong.");
	        }else {
	        	value =  queue[(front + 1) % N];
	        }
	        return value;
	    }
	    
	    public void displayQueue() {
	        if (isEmpty()) {
	            System.out.println("Antrean Bioskop Kosong.");
	        }else {
		        System.out.println("Antrean: ");
		        int current = front;
		        while (current != rear) {
		            System.out.println(queue[current]);
		            current = (current + 1) % N;
		        }
		        System.out.println(queue[current]);
	        }
	    }
	    
	    public void check() {
	        if (queue[0]==null) {
	            System.out.println("Antrean Bioskop Kosong.");
	        }else {
	        	System.out.println("Index: "+ front +" |isiFront: "+ queue[front]);
	        	System.out.println("Index: "+ rear +" |isiRear: "+ queue[rear]);
		        System.out.println("check: ");
		        	
		        for(int i=0; i<N; i++) {
		        	System.out.println(queue[i]);
		        }
	        }
	    }
}
