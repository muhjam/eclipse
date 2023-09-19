package Tugas01;
import java.util.Scanner;
public class PersegiPanjang01 {
		public static void main(String[] args) {
			float panjang, lebar, luas, keliling;
			
			Scanner sc= new Scanner(System.in);
			System.out.print("Panjang	: "); panjang=sc.nextFloat();
			System.out.print("Lebar	: "); lebar=sc.nextFloat();
			
			luas= panjang * lebar;
			System.out.println("Luas	: "+luas);
			
			keliling= 2*panjang + 2*lebar;
			System.out.println("Keliling: "+keliling);
		}
}
