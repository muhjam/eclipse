package Latihan05;

public class Mahasiswa extends Orang {
	String nrp;
	
	public Mahasiswa (String nrp, String nama, String alamat) {
		super(nama, alamat);
		setNrp(nrp);
	}
	
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	
	public String getNrp() {
		return nrp;
	}
}
