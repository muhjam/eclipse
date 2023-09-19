package ListMatakuliah;

import java.util.*;

public class ListMain {
	public static void main(String[] args) {
		ListMatakuliah list = new ListMatakuliah();
		Scanner sc = new Scanner(System.in);
		
		list.addHead(new Matakuliah("IF001","Dasar Pemograman", 4));
		list.addHead(new Matakuliah("IF002","Pemograman Web", 3));
		list.addHead(new Matakuliah("IF003","Algoritma Pemograman 1", 4));
		list.addHead(new Matakuliah("IF004","Algoritma Pemograman 2", 3));
		list.addHead(new Matakuliah("IF005","Matematika Informatika 1", 4));
		list.addHead(new Matakuliah("IF006","Matematika Informatika 2", 3));
		list.displayElement();
		System.out.println("Jumlah Matakuliah: " + list.count());
		
		int x, sks, posisi;
		String kode, nama;
		do {
			do {
				System.out.println("-- SELAMAT DATANG --");
				System.out.println("Menu Perintah");
				System.out.println("1. Add Head");
				System.out.println("2. Add Mid");
				System.out.println("3. Add Tail");
				System.out.println("4. Remove Head");
				System.out.println("5. Remove Mid");
				System.out.println("6. Remove Tail");
				System.out.println("7. Remove All");
				System.out.println("8. Count");
				System.out.println("9. Find");
				System.out.println("0. exit");
				System.out.print("Pilih Perintah: ");
				x = sc.nextInt();
			} while (x > 9 && x < 0);
			
			switch (x) {
				case 0:
					System.out.println("Terima Kasih");
					break;
				case 1: 
					System.out.print("Kode: ");
					kode = sc.next();
					System.out.print("Nama: ");
					nama = sc.next();
					System.out.print("SKS: ");
					sks = sc.nextInt();
					list.addHead(new Matakuliah(kode, nama, sks));
					list.displayElement();
					break;
				case 2: 
					System.out.print("Kode: ");
					kode = sc.next();
					System.out.print("Nama: ");
					nama = sc.next();
					System.out.print("SKS: ");
					sks = sc.nextInt();
					System.out.print("Posisi: ");
					posisi = sc.nextInt();
					list.addMid(new Matakuliah(kode, nama, sks), posisi);
					list.displayElement();
					break;
				case 3: 
					System.out.print("Kode: ");
					kode = sc.next();
					System.out.print("Nama: ");
					nama = sc.next();
					System.out.print("SKS: ");
					sks = sc.nextInt();
					list.addTail(new Matakuliah(kode, nama, sks));
					list.displayElement();
					break;
				case 4: 
					list.removeHead();
					list.displayElement();
					break;
				case 5: 
					System.out.print("Kode: ");
					kode = sc.next();
					list.removeMid(kode);
					list.displayElement();
					break;
				case 6: 
					list.removeTail();
					list.displayElement();
					break;
				case 7: 
					list.removeAll();
					list.displayElement();
					break;
				case 8: 
					System.out.println("Jumlah Matakuliah: " + list.count());
					break;
				case 9:
					System.out.print("Cari Kode MK: ");
					kode = sc.next();
					System.out.print(list.find(kode));
					break;
			}
		}while(x != 0);
	}	
}