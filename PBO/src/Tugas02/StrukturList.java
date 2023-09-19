package Tugas02;

public class StrukturList {
	Node head;
	 boolean isEmpty () {
			return (head == null);
		}

	 void addHead(int data) {
			Node newNode=new Node(data);
			
			if(head == null) {
				head = newNode;
			}else {
			newNode.setNext(head);
			head=newNode;
			}
		}
	 
	 void addMid(int data, int position) {
			Node posNode=null, curNode;
			Node newNode=new Node(data);
			int i;
			
			if(head==null) {
				head = newNode;
			}else {
				curNode=head;
				if(position==1) {
					newNode.setNext(curNode);
					head=newNode;
				}else {
					i=1;
					while(curNode != null && i<position) {
						posNode=curNode;
						curNode=curNode.getNext();
						i++;
					}
					posNode.setNext(newNode);
					newNode.setNext(curNode);
				}
			}
		}
	 
	void addTail(int data) {
			Node posNode=null, curNode;
			Node newNode=new Node(data);
			
			if(isEmpty()) {
				head = newNode;
			}else {
				curNode=head;
				while(curNode!=null) {
					posNode=curNode;
					curNode=curNode.getNext();
				}
				posNode.setNext(newNode);
			}
		}
		
	void displayElement() {
			Node curNode;
			
			curNode=head;
			while(curNode!=null) {
				System.out.print(curNode.getData()+" ");
				curNode=curNode.getNext();
			}
		}
	
	public static void main(String[] args) {
		StrukturList List= new StrukturList();
		
		List.addTail(3);
		List.addTail(4);
		List.addMid(7, 2);
		List.addMid(8, 2);
		List.addHead(5);
		
		List.displayElement();
	}	
}
