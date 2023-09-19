package Tugas07;

public class Tabung extends Bentuk {
	
	public Tabung() {
		super(0);
	}
	
	public Tabung(int jari2, int tinggi) {
		super(jari2);
		this.tinggi = tinggi;
	}
	
	@Override
	public double luas() {
		return 2*PHI*jari2*(jari2+tinggi);
	}
}
