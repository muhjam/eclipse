package Queue;

public class MainQueue {

	public static void main(String[] args) {
		StructureQueue Q = new StructureQueue();
		
		System.out.println("### Sebelum Enqueue 3x ###");
		System.out.println("size: " + Q.size());
		System.out.println("isEmpty: " + Q.isEmpty());
		System.out.println("front: " + Q.front());
		System.out.print("Elemen Queue: ");
		Q.displayElement();
		System.out.println();
		System.out.println();
		System.out.println("### Enqueue 3x ###");
		Q.enqueue(3);
		Q.enqueue(2);
		Q.enqueue(1);
		System.out.println("size: " + Q.size());
		System.out.println("isEmpty: " + Q.isEmpty());
		System.out.println("front: " + Q.front());
		System.out.print("Elemen Queue: ");
		Q.displayElement();
		System.out.println();
		System.out.println("### Dequeue 2x ###");
		Q.dequeue();
		Q.dequeue();
		System.out.println("size: " + Q.size());
		System.out.println("isEmpty: " + Q.isEmpty());
		System.out.println("front: " + Q.front());
		System.out.print("Elemen Queue: ");
		Q.displayElement();
		System.out.println();
		System.out.println("### Enqueue 4x ###");
		Q.enqueue(2);
		Q.enqueue(7);
		Q.enqueue(6);
		Q.enqueue(1);
		System.out.println("size: " + Q.size());
		System.out.println("isEmpty: " + Q.isEmpty());
		System.out.println("front: " + Q.front());
		System.out.print("Elemen Queue: ");
		Q.displayElement();
	}
}
