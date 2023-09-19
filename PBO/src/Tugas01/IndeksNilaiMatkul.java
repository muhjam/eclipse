package Tugas01;
public class IndeksNilaiMatkul {
	public static void main(String[] args) {
		int N=4;
		int[] NA= {77, 110, -1 ,25}; 
		String idx;
		System.out.println("NO	Input	Output");
		for(int i=0;i<N;i++) {
			if(NA[i]>100) {
				idx="Nilai di luar jangkauan";
			}else if(NA[i]>=81 && NA[i]<=100) {
				idx="A";
			}else if(NA[i]>=76 && NA[i]<=80) {
				idx="AB";
			}else if(NA[i]>=56 && NA[i]<=75) {
				idx="B";
			}else if(NA[i]>=51 && NA[i]<=55) {
				idx="BC";
			}else if(NA[i]>=41 && NA[i]<=50) {
				idx="C";
			}else if(NA[i]>=21 && NA[i]<=40) {
				idx="D";
			}else if(NA[i]>=0 && NA[i]<=20) {
				idx="E";
			}else {
				idx="Nilai harus diisi";
			}
			System.out.println(i+1+"	"+NA[i]+"	"+idx);
		}
	}
}
