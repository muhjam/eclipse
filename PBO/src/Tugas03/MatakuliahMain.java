package Tugas03;

public class MatakuliahMain {
	public static void main(String[] args) {
		
		// Create objek matakuliah
		Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemograman 1", "A", 3);
		Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemograman 2", "BC", 3);
		Matakuliah mk3 = new Matakuliah("003", "Pemograman Berorientasi Objek", "B", 3);
		   
		// Tampilkan daftar matakuliah
		System.out.println("--- DAFTAR MATAKULIAH ---");
		System.out.println(mk1.display());
		System.out.println(mk2.display());
		System.out.println(mk3.display());
		
		System.out.println("--- NILAI IPK ---");
		int totalSKS = mk1.getSKS() + mk2.getSKS() + mk3.getSKS();
		double IPK = ((mk1.nilaiIndex()*mk1.getSKS()) + (mk2.nilaiIndex()*mk2.getSKS()) + (mk3.nilaiIndex()*mk3.getSKS())) / totalSKS;
		System.out.println("IPK: "+IPK);
	}
}
