
public class Araba {
	
	
	private String renk;
	private int kapi_sayisi;
	private int tekerlek_sayisi;
	private String motor;
	private String model;
	
	
	public void setModel(String model) {
		this.model = model;
		
	}
	
	public String getModel() {
		return this.model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getKapi_sayisi() {
		return kapi_sayisi;
	}

	public void setKapi_sayisi(int kapi_sayisi) {
		
		if(kapi_sayisi<0) {
			System.out.print("kapi sayisi 0'dan kucuk olamaz!");
		}else {
			this.kapi_sayisi = kapi_sayisi;
		}
	}

	public int getTekerlek_sayisi() {
		return tekerlek_sayisi;
	}

	public void setTekerlek_sayisi(int tekerlek_sayisi) {
		this.tekerlek_sayisi = tekerlek_sayisi;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	
	
};
