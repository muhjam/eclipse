package Tugas05;
public class InheritanceMain {
	
	 public static void main(String[] args) 
	 {
			PersegiPanjang pp = new PersegiPanjang(26, 20);
			System.out.println("Panjang : " + pp.getPanjang() + "\n" +
							"Lebar :" + pp.getLebar() + "\n" +
							"Luas : " + pp.getLuas() + "\n" +
							"Keliling : " + pp.getKeliling());
	    }
}
