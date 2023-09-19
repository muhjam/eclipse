package Latihan05;

public class Orang {
	protected String nama, alamat;
	
	public Orang(String nama, String alamat) {
		this.nama = nama;
		this.alamat = alamat;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
}
