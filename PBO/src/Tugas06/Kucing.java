package Tugas06;

public class Kucing extends Binatang {
	public Kucing(String nama, int umur) {
		super(nama, umur);
	}
	
	@Override
	public void suara(){
		System.out.println("Meow Meow!");
	}
}
