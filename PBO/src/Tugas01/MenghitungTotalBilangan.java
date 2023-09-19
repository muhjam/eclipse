package Tugas01;
import java.util.Scanner;
public class MenghitungTotalBilangan {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int ex=0;ex<2;ex++) {
			int total= 0;
			System.out.print("N = ");int N=sc.nextInt();
			if(N>0) {
				int[] Bill= new int[N];
				for(int i=0;i<N;i++) {
					System.out.print("Bill ke-"+(i+1)+": ");int nilai=sc.nextInt();
					Bill[i]=nilai;
				}
				System.out.println("\nN = "+N);
				for(int i=0;i<N;i++) {
					total=total+Bill[i];
					System.out.println(Bill[i]);
				}
			}else {
				System.out.println("N tidak boleh nol atau minus");	
			}
			System.out.println("Total = "+ total+"\n");
		}	
	}
}
