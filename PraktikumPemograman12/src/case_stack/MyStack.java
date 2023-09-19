package case_stack;

public class MyStack extends AbstractStack	{

	public MyStack (int capacity) {
		super(capacity);
	}
	
	public void displayStack(String s) {
		System.out.print(s);
		System.out.print("Stack (bottom-->Top): ");
		for(int i = 0; i < size(); i++) {
			System.out.print(peekN(i));
			System.out.print(' ');
		}
		System.out.println("");
	}
	

	public int peekN(int n) {
		return arr[n];
	}
	 
	 public void push(int data) {
		 if(isFull()) {
			 System.out.println("Stack Penuh");
		 }else {
			 TOP++;
			 arr[TOP]=data;
		 }
	 }
	 
	 public int pop() {
		 int temp=0;
		 if(isEmpty()) {
			 System.out.println("Stack Kosong");
		 }else {
			 temp=arr[TOP];
			 TOP=TOP-1;
		 }
		 return temp;
	 }
	
	
}
