package Tugas06;
import java.util.Scanner;
public class InterfaceMain {

	public static void main(String[] args) {
		String npm, pass;
		int coba=0;
		Scanner sc = new Scanner(System.in);
		
		AkunMahasiswa akun = new AkunMahasiswa("213040057", "jamjam123");
		System.out.println("== Selamat Datang Di Situ 2");
		do {
			if(coba > 0) {
				System.out.println("Maaf, NPM atau password yang anda masukan salah!");
			}
			System.out.println("Silahkan Masukan");
			System.out.print("NPM : "); npm = sc.next();
			System.out.print("Password : "); pass = sc.next();
			coba++;
		}while(!akun.login(npm, pass));
		System.out.println("Anda Berhasil Login");
	}
}
