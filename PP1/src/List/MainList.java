package List;

public class MainList {
	public static void main(String[] args) {
		StrukturList List= new StrukturList();
	
		List.addTail(7);
		List.addTail(6);
		List.addTail(4);
		List.addTail(2);
		List.addTail(3);
		
		List.displayElement();
		System.out.println(List.size());
	}	
}
