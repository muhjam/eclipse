package Tugas06;

public class AbstractMain {

	public static void main(String[] args) {
		Anjing A = new Anjing("Jimmy", 3);
		A.displayInfo();
		A.suara();
		
		Kucing K = new Kucing("Ranca", 5);
		K.displayInfo();
		K.suara();
	}

}
