package NodeMahasiswa;

public class StrukturList {
	Node head=null;
	 boolean isEmpty () {
			return (head == null);
		}
	void addTail(Mahasiswa data) {
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
	public Mahasiswa find(String nrp) {
		Node curNode = head;
		boolean ketemu = false;
		
		while (curNode != null && !ketemu) {
			if(curNode.getData().nrp== nrp) {
				ketemu = true;
			}else {
				curNode = curNode.getNext();
			}
		}
		
		if(ketemu==true) {
			return curNode.getData();
		}else {
			return null;
		}
		
		
	}
}
