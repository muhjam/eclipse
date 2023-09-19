package Tugas06;

public class Anjing extends Binatang {
	public Anjing(String nama, int umur) {
		super(nama, umur);
	}
	
	@Override
	public void suara() {
		System.out.println("Gog Gog!");
	}
}
