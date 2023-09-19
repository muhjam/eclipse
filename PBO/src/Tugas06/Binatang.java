package Tugas06;

public abstract class Binatang {
	protected String nama;
	protected int umur;
	
	public Binatang(String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}
	
	public abstract void suara();
	
	public void displayInfo() {
		System.out.println("Nama: " + nama);
		System.out.println("Umur: " + umur);
	}
}
