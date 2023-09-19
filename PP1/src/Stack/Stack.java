package Stack;
public class Stack {
	public static void main(String[] args) {
		System.out.println("LATIHAN!");
		StrukturStack Stack = new StrukturStack(3); 
		System.out.println("Size: " + Stack.size());
		System.out.println("Empty: " + Stack.isEmpty());
		System.out.println("Full: " + Stack.isFull());
		System.out.println("Top: " + Stack.top());
		System.out.print("Element from TOP: ");
		Stack.displayElement();
		System.out.println("");
		
		System.out.println("#Melakukan push 3x");
		Stack.push(2);
		Stack.push(4);
		Stack.push(1);
		System.out.println("push 2, push 3, push 1");
		System.out.println("Size: " + Stack.size());
		System.out.println("Empty: " + Stack.isEmpty());
		System.out.println("Full: " + Stack.isFull());
		System.out.println("Top: " + Stack.top());
		System.out.print("Element from TOP: ");
		Stack.displayElement();
		System.out.println("");
		
		System.out.println("TUGAS!");
		System.out.println("#Melakukan pop 1x");
		Stack.pop();
		System.out.println("Size: " + Stack.size());
		System.out.println("Empty: " + Stack.isEmpty());
		System.out.println("Full: " + Stack.isFull());
		System.out.println("Top: " + Stack.top());
		System.out.print("Element from TOP: ");
		Stack.displayElement();
	}
}
