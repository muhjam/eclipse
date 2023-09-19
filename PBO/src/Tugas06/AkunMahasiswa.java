package Tugas06;

public class AkunMahasiswa implements Akun {
	private String npm;
	private String pass;
	
	public AkunMahasiswa(String npm, String pass) {
		super();
		this.npm = npm;
		this.pass = pass;
	}
	
	@Override
	public boolean login(String npmInput, String passInput) {	
		return npm.equals(npmInput)&&pass.equals(passInput) ? true : false;
	}
	
	@Override
	public String encode(String pass) {
		return null;
	}
}
