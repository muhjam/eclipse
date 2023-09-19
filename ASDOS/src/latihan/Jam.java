package latihan;
import java.util.Scanner;

public class Jam {
	// MAIN PROGRAM
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			RecordJam J = new RecordJam();
			System.out.print("Jam: "); J.jam = sc.nextInt();
			System.out.print("Menit: "); J.menit = sc.nextInt();
			System.out.print("Detik: "); J.detik = sc.nextInt();
			System.out.print(J.jam + ":" + J.menit + ":" + J.detik); 
		}
	
}
