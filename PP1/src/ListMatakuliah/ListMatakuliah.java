package ListMatakuliah;

public class ListMatakuliah {
	Node head=null;
	
	boolean isEmpty () {
		return (head == null);
	}
	
	void addHead(Matakuliah data) {
		Node newNode=new Node(data);
			
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head=newNode;
		}
	}
	 
	public void displayElement() {
		if (isEmpty()) {
			System.out.println("List Kosong");
		 } else {
			Node curNode = head;
			while (curNode != null) {
				System.out.println(curNode.getData().getKode()+", "+curNode.getData().getNama()+", "+curNode.getData().getSks());
				curNode = curNode.getNext();
			}
			System.out.println();
		 }	
	}
	 
	void addMid(Matakuliah data, int position) {
		Node posNode = null, curNode;
		Node newNode = new Node(data);
		int i;
			
		if (head == null) {
			head = newNode;
		} else {
			curNode = head;
			if (position == 1) {
				newNode.setNext(curNode);
				head = newNode;
			} else {
				i = 1;
				while (curNode != null && i < position) {
					posNode = curNode;
					curNode = curNode.getNext();
					i++;
				}
				posNode.setNext(newNode);
				newNode.setNext(curNode);
			}
		}
	}
	 
	void addTail(Matakuliah data) {
		Node posNode=null, curNode;
		Node newNode=new Node(data);
			
		if (isEmpty()) {
			head = newNode;
		} else {
			curNode = head;
			while (curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
	}
	
	 public void dispose(Node temp) {
		 temp.setNext(null);
		 temp = null;
	 }
	 
	public void removeHead() {
		if(isEmpty()) {
			System.out.print("List kosong");
		}else {
			Node temp = head;
			head=head.getNext();
			dispose(temp);
		}
		
	}
	
	public void removeTail() {
		Node preNode, lastNode;
		preNode=null;
		if(head!=null) {
			if(head.getNext()==null) {
				head=null;
			}else {
				lastNode=head;
				while(lastNode.getNext()!=null) {
					preNode=lastNode;
					lastNode=lastNode.getNext();
				}
				preNode.setNext(null);
				dispose(lastNode);
			}
		}
		
	}
	
	public void removeMid(String kode) {
		Node preNode = null, delNode;
		int i;
		boolean ketemu;
		
		if(head != null) {
			ketemu = false; i = 1;
			delNode = head;
			while (delNode.getNext() != null && ketemu == false) {
				if (delNode.getData().getKode().equals(kode)) {
					ketemu = true;
				} 
				else {
					preNode = delNode;
					delNode = delNode.getNext();
					i++;
				}
			}
			if(ketemu == true) {
				if(i == 1) {
					head = null;
				}
				else {
					preNode.setNext(delNode.getNext());
					dispose(delNode);
				}
			}
		}
	}
	
	public void removeAll() {
		head = null;
		System.out.println("List Kosong");
	}
	 
	public int count() {
		Node curNode;
		int jumlah;
			
		curNode = head;
		jumlah = 0;
			
		while (curNode != null) {
			jumlah = jumlah + 1;
			curNode = curNode.getNext();
		}
			
		return jumlah;
	}
	 
	public boolean find(String kode) {
		Node curNode = head;
		boolean ketemu = false;
			
		while (curNode != null && !ketemu) {
			if (curNode.getData().getKode().equals(kode)) {
				ketemu = true;
			} else {
				curNode = curNode.getNext();
			}
		}
		return ketemu;
	}
}