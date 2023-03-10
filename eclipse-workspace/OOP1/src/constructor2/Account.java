package constructor2;

public class Account {
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	public Account() { //constructor tanimladik. Objeler olusturulurken cagrilan ilk fonksiyon constructordir.
		System.out.print("my cons");
	}
	
	public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo) {
		this.bakiye=bakiye;
		this.email=email;
		this.hesapNo=hesapNo;
		this.isim=isim;
		this.telefonNo=telefonNo;
	}
	
	
	public void paraYatir(double miktar) {
		this.bakiye +=miktar;
		System.out.println("Bakiye : " +this.bakiye);
	}
	
	public void paraCek(double miktar) {
		if(miktar>bakiye) {
			System.out.println("Hesabinizda yeteri kadar para yok!"+this.bakiye);
			
		}
		
		if(miktar>1500) {
			System.out.println("Bir gunde 1500 turk lirasindan fazla para cekemezsiniz!");
		}else {
			bakiye=bakiye-miktar;
			System.out.println("Bakiyeniz: "+this.bakiye);
		}
	}
	
	
	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	
	
}
