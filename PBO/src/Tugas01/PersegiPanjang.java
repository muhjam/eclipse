package Tugas01;
import java.util.Scanner;
public class PersegiPanjang {
	float panjang, lebar;
	
	float hitungLuas(float panjang, float lebar) {
		return  panjang * lebar;
	}
	
	double hitungKeliling(float panjang, float lebar) {
		return 2*panjang + 2*lebar;
	}
	
	void tampil() {
		System.out.println("\nPanjang	: "+ panjang
				+ "\nLebar	: "+ lebar
				+ "\nLuas	: "+ hitungLuas(panjang,lebar)
				+ "\nKeliling: "+ hitungKeliling(panjang,lebar)
		);
	}
		public static void main(String[] args) {
			PersegiPanjang A= new PersegiPanjang();
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Panjang	: "); A.panjang=sc.nextFloat();
			System.out.print("Lebar	: "); A.lebar=sc.nextFloat();
			
			A.tampil();
		}
}
