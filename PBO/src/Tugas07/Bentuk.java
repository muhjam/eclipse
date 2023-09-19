package Tugas07;

public abstract class Bentuk {
	protected double PHI = 3.14;
	protected int jari2;
	protected int tinggi;
	
	public Bentuk(int jari2) {
		super();
		this.jari2 = jari2;
	}
	
	public abstract double luas();

	public double getPHI() {
		return PHI;
	}

	public void setPHI(double pHI) {
		PHI = pHI;
	}

	public int getJari2() {
		return jari2;
	}

	public void setJari2(int jari2) {
		this.jari2 = jari2;
	}		
	
	public int getTinggi() {
		return tinggi;
	}
}
