package test;

import java.util.*;

public class Mahasiswa {
	String NRP, Nama;
	double UTS, UAS, Prak, Quiz, Tugas, Hadir, NA;
	char Indeks;
	Scanner sc = new Scanner(System.in);
	
	void bacaMahasiswa() {
		System.out.print("NRP : "); NRP = sc.next();
		System.out.print("Nama : "); Nama = sc.next();
		System.out.print("UTS : "); UTS = sc.nextDouble();
		System.out.print("UAS : "); UAS = sc.nextDouble();
		System.out.print("Prak : "); Prak = sc.nextDouble();
		System.out.print("Quiz : "); Quiz = sc.nextDouble();
		System.out.print("Tugas : "); Tugas = sc.nextDouble();
		System.out.print("Hadir : "); Hadir = sc.nextDouble();
		NA = hitungNa();
		setIndeks();
	}
	
	double hitungNa() {
		return 0.3 * UTS + 0.3 * UAS + 0.2 * Prak + 0.05 * Quiz + 0.05 * Hadir + 0.1 * Tugas;
	}
	
	char setIndeks() {
		Indeks = 'T';
		
		if  (NA >= 85) {
			Indeks = 'A';
		}else if (NA >= 75) {
					Indeks = 'B';
				}else if (NA >= 55) {
							Indeks = 'C';
					}else if (NA >= 45) {
								Indeks = 'D';
					}else {
						Indeks = 'E';
					}
		
		return Indeks;
	}
	
	void tulisMahasiswa() {
		System.out.println("\n"
				+ "Hasil Penilaian Mahasiswa");
		
		System.out.println("NRP : " +  NRP);
		System.out.println("Nama : " +  Nama); 
		System.out.println("UTS : " +  UTS); 
		System.out.println("UAS : " +  UAS); 
		System.out.println("Prak : " +  Prak); 
		System.out.println("Quiz : " +  Quiz); 
		System.out.println("Tugas : " +  Tugas); 
		System.out.println("Hadir : " +  Hadir); 
		System.out.println("NA : " +  NA); 
		System.out.println("Indeks : " +  Indeks); 
	}
	

	public static void main(String[] args) {
		// MAIN PROGRAM
		Mahasiswa M = new Mahasiswa();
		
		M.bacaMahasiswa();
		M.tulisMahasiswa();
	}

}
