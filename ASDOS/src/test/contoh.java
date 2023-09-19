package test;
import java.util.Scanner;
public class contoh {
	// kamus
	int jam, menit, detik;
	
	// procedure
	void tulisJam (int a, int b, int c) {
		//description
		System.out.print(a + ":" + b + ":" + c);
		
	}
	
	// MAIN PROGRAM
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		contoh A = new contoh();
		System.out.print("Jam: "); A.jam = sc.nextInt();
		System.out.print("Menit: "); A.menit = sc.nextInt();
		System.out.print("Detik: "); A.detik = sc.nextInt();
		A.tulisJam(A.jam, A.menit, A.detik);
	}
}
