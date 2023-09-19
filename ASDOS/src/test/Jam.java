package test;
import java.util.*;
public class Jam {
	// jam:menit:detik
	 int jam, menit, detik;
	
	Scanner sc= new Scanner(System.in);
	
	// procedure : tidak mengmbalikan nilai dan ditandai dengan void
	// function : mengembalikan nilai (return) dan ditandai dengan tipe data (int, String, dll)
	
	 void bacaJam() {
		do {
				System.out.print( "Jam : " );
				jam = sc.nextInt();
		}while( jam < 0 || jam > 23 );
		
		do {
				System.out.print( "Menit : " );
				menit = sc.nextInt();
		}while( menit < 0 || menit > 59 );
		
		do {
				System.out.print( "Detik : " );
				detik = sc.nextInt();
		}while( detik < 0 || detik > 59 );
	}
	
	void tulisJam() {
		System.out.println( jam + ":" + menit + ":" + detik );
	}
	
	void ucapan() {
		if ( jam >=0 && jam <= 5 ) {
			System.out.println( "Selamat Subuh" );
		} else if ( jam >=6 && jam <= 10 ) {
			System.out.println( "Selamat Pagi" );
		} else if ( jam >=11 && jam <= 15 ) {
			System.out.println( "Selamat Siang" );
		} else if ( jam >=16 && jam <= 18 ) {
			System.out.println( "Selamat Sore" );
		} else if ( jam >=19 && jam <= 23 ) {
			System.out.println( "Selamat Malam" );
		}
	}
	
	String ucapan2() {
		String ucapan=null;
		
		if ( jam >=0 && jam <= 5 ) {
			ucapan= "Selamat Subuh";
		} else if ( jam >=6 && jam <= 10 ) {
			ucapan= "Selamat Pagi";
		} else if ( jam >=11 && jam <= 15 ) {
			ucapan= "Selamat Siang";
		} else if ( jam >=16 && jam <= 18 ) {
			ucapan= "Selamat Sore";
		} else if ( jam >=19 && jam <= 23 ) {
			ucapan= "Selamat Malam";
		}
		
		return ucapan;
	}
	
	// MAIN PROGRAM
	public static void main (String[] args) {
		Jam J = new Jam();	
		
		J.bacaJam();
		J.tulisJam();
		System.out.println( J.ucapan2() );
	}
	
}
