package List;

import java.util.Scanner;

public class Oprasi {
	Node head;
	boolean isEmpty () {
		return (head == null);
	}
	
	void tambahDepan (int dataBaru) {
		Node tambahData = new Node(dataBaru);
		 tambahData.data = dataBaru;
		 tambahData.pointer = null;
		 if (isEmpty()) {
			 head = tambahData;
		 } else {
			 tambahData.pointer = head;
			 head = tambahData;
		}
		 System.out.println("Data telah ditambahkan");
	}
	
	void tambahAkhir (int dataBaru) {
		Node tambahData = new Node(dataBaru);
		tambahData.data = dataBaru;
		tambahData.pointer = null;
		if (isEmpty()) {
			head = tambahData;
			}else {
				Node bantu = head;
				while (bantu.pointer!=null) {
					bantu = bantu.pointer;
				}
				bantu.pointer = tambahData;
			}
			System.out.println("Data telah ditambahkan");
		}
	
	void tampilData () {
		Node posisi = head;
		if (isEmpty()) {
			System.out.println("Data masih kosong");
		  } else {
			  while (posisi!=null) {
				  System.out.print(posisi.data+", ");
				  posisi = posisi.pointer;
			  }
		  	}
		}
	
	public static void main(String[] args) {
		Oprasi A=new Oprasi();
		Scanner sc = new Scanner(System.in);
		int x=0;
		
		do {
		int menu, nilai;

		System.out.println("Selamat Datang...\n"
				+ "Daftar Menu\n"
				+ "1. Tambah Depan\n"
				+ "2. Tambah Akhir\n"
				+ "3. Tampil Data\n"
				+ "4. Keluar");
	   System.out.print("Menu pilihan anda: ");menu=sc.nextInt();
				
			switch(menu) {
			case 1:
				System.out.print("Input Nilai: ");nilai =sc.nextInt();
				A.tambahDepan(nilai);
				break;
			case 2:
				System.out.print("Input Nilai: ");nilai =sc.nextInt();
				A.tambahAkhir(nilai);
				break;
			case 3:
				A.tampilData();
				break;
			case 4:
				System.out.println("Terima Kasih... ");
				x=1;
			}
		}while(x==0);
	}
}


