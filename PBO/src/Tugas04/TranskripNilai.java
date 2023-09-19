package Tugas04;
import java.util.*;

public class TranskripNilai {
	private Date tglCetak;
	private double ipk=0.0;
	private List<KartuHasilStudi> kartuHasilStudi;
	private Mahasiswa mahasiswa;
	
	public TranskripNilai(Mahasiswa mahasiswa) {
		super();
		this.mahasiswa = mahasiswa;
		
		kartuHasilStudi = new ArrayList<KartuHasilStudi>();
		tglCetak = new Date();
	}
	
	public void hitungIPK() {
		double totalIPS=0;
		int totalSemester=0;

		for (KartuHasilStudi khs : kartuHasilStudi) {
			khs.hitungIPS();
			totalIPS+=khs.getIPS();
			totalSemester+=1;
		}
		
		if(totalSemester>0) {
			ipk = totalIPS/totalSemester;
		}
	}
	
	public void addKHS(KartuHasilStudi khs) {
		kartuHasilStudi.add(khs);
	}
	
	public void display() {
		hitungIPK();
		System.out.println(mahasiswa.display());
		System.out.println("Tanggal Cetak: "+ tglCetak.toString());
		System.out.println("IPK: "+ipk);
		for(KartuHasilStudi khs : kartuHasilStudi) {
			System.out.println(khs.display());
		}
	}
	
	public void setTranskripNilai(Date tglCetak, double ipk, List<KartuHasilStudi> kartuHasilStudi, Mahasiswa mahasiswa) {
		 this.tglCetak = tglCetak;
		 this.ipk = ipk;
		 this.kartuHasilStudi = kartuHasilStudi;
		 this.mahasiswa = mahasiswa;
	 }
	
	public Date getTglCetak() {
		return tglCetak;
	}
	
	public double getIPK() {
		return ipk;
	}
	
	public List<KartuHasilStudi> getKHS() {
		return kartuHasilStudi;
	}
}
