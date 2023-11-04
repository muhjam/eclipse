package Matriks2023;

import java.util.Scanner;

public class Matriks {

	
	int [][] a, b, c;
	Scanner bc = new Scanner(System.in);
	
	void inisial(int baris, int kolom) {
		a = new int [baris][kolom];
		b = new int [baris][kolom];
		c = new int [baris][kolom];
	}
	
	void insert_nilai_matriks() {
		System.out.println("Masukkan matriks A:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {	
				a[i][j] = bc.nextInt();
			}
		}
		System.out.println("Masukkan matriks B:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {	
				b[i][j] = bc.nextInt();
			}
		}
	}
	
	void operasi_perkalian() {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {	
				c[i][j] = 0;
				for (int k = 0; k < a[i].length; k++) {	
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
	}
	
	void operasi_tambahan() {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {	
				c[i][j] = a[i][j] + b[i][j];
			}
		}
	}
	
	void operasi_pengurangan() {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {	
				c[i][j] = a[i][j] - b[i][j];
			}
		}
	}
	
	void tampil () {
		for (int i = 0; i < c.length; i++) {
			System.out.print("|");
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(" " + c[i][j] + " ");
			}
			System.out.println("|");
		}
	}
	
	public static void main (String[] args) {
		Matriks m = new Matriks();
		m.inisial(2,  2);
		m.insert_nilai_matriks();
		m.operasi_perkalian();
		System.out.println("Perkalian:");
		m.tampil();
		m.operasi_tambahan();
		System.out.println("Pertambahan:");
		m.tampil();
		m.operasi_pengurangan();
		System.out.println("Pengurangan:");
		m.tampil();
	}
}
