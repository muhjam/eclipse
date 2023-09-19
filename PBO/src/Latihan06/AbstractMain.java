package Latihan06;

public class AbstractMain {

	public static void main(String[] args) {
		Lingkaran L = new Lingkaran(10);
		System.out.println("== Lingkaran ==\n"
				+ "jari2: "+ L.jari2+"\n"
						+ "luas: "+ L.luas());
		
		Tabung T = new Tabung(10, 5);
		System.out.println("== Tabung ==\n"
				+ "jari2: "+ T.jari2+", Tinggi: "+ T.getTinggi() + "\n"
						+ "luas: "+ T.luas());
	}

}
