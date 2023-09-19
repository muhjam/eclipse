package Tugas02;

public class Lingkaran {
	private double jari2;
	private final static double PHI=3.14;
	
	public Lingkaran(double jari2) {
		this.jari2=jari2;
	}
	
	public double getJari2() {
	      return this.jari2;
	   }
	
	
	 public void setJari2(double jari2) {
	      this.jari2 = jari2;
	   }
	
	public double hitungLuas() {
		return PHI*jari2*jari2;
	}
}
