package Tugas05;

public class PersegiPanjang extends BangunDatar 
{
	float panjang, lebar;
	
	public PersegiPanjang(float panjang, float lebar) 
	{
		super(panjang*lebar, 2*panjang + 2*lebar);
		setPanjang(panjang);
		setLebar(lebar);
	}

	public float getPanjang() {
		return panjang;
	}

	public void setPanjang(float panjang) {
		this.panjang = panjang;
	}

	public float getLebar() {
		return lebar;
	}

	public void setLebar(float lebar) {
		this.lebar = lebar;
	}
	
	
}
