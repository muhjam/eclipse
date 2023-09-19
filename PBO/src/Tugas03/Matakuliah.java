package Tugas03;

public class Matakuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	
	/* Konsuktor */
	public Matakuliah(String kode, String nama, String index, int sks) {
		super();
		this.kode=kode;
		this.nama=nama;
		this.index=index;
		this.sks=sks;
	}
	
	public double nilaiIndex() {
		double hasil;
		switch(index) {
		case "A":
			hasil=4;
			break;
		case "AB":
			hasil=3.5;
			break;
		case "B":
			hasil=3;
			break;
		case "BC":
			hasil=2.5;
			break;
		case "C":
			hasil=2;
			break;
		case "D":
			hasil=1;
			break;
		default:
			hasil=0;
		}
		
		return hasil;
	}
	
	public String display() {
		return kode + " - " + nama + " - " + index;
	}
	
	// fungsi tambahan untuk mendapatkan nilai sks
	public int getSKS() {
		return sks;
	}
}
