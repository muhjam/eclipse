package NodeMahasiswa;

public class Node {
 private Mahasiswa data;
 private Node next;

 public Node(Mahasiswa data) {
	 this.data=data;
 }
 
 public void setData(Mahasiswa data) {
	 this.data=data;
 }
 
 public Mahasiswa getData() {
	 return data;
 }
 
 public void setNext(Node next) {
	 this.next=next;
 }
 
 public Node getNext() {
	 return next;
 }
 
}
