package Stack;
import java.util.Scanner;
public class KelasUtama {
	public static void main(String[] args) {
		Oprasi A=new Oprasi();
		Scanner sc = new Scanner(System.in);
		int x=0;
		
		do {
		int menu, nilai;

		System.out.println("Selamat Datang...\n"
				+ "Daftar Menu\n"
				+ "1. Push\n"
				+ "2. Pop\n"
				+ "3. Jumlah data stack\n"
				+ "4. Tampil Data\n"
				+ "5. Keluar");
	   System.out.print("Menu pilihan anda: ");menu=sc.nextInt();
				
			switch(menu) {
			case 1:
				System.out.print("Input Nilai: ");nilai =sc.nextInt();
				A.push(nilai);
				break;
			case 2:
				System.out.print("Input Nilai: ");nilai =sc.nextInt();
				A.pop();
				break;
			case 3:
				A.tampilData();
				break;
			case 4:
				A.tampilData();
				break;
			case 5:
				System.out.println("Terima Kasih... ");
				x=1;
			}
		}while(x==0);
	}
}
