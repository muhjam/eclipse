package Tugas04;

public class Mahasiswa {
	private String NRP;
	private String nama;
	
	public Mahasiswa() {
		
	}
	
	public Mahasiswa (String nRP, String nama) {
		super();
		NRP=nRP;
		this.nama=nama;
	}
	
	public String display() {
		return "NRP : "+ NRP + ", Nama : "+ nama;
	}
	
	 public void setMhs(String NRP, String nama) {
		 this.NRP=NRP;
		 this.nama=nama;
	 }
	 
	 public String getNrp() {
		 return NRP;
	 }
	 
	 public String getNama() {
		 return nama;
	 }
}
