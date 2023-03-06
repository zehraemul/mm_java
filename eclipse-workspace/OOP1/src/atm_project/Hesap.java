package atm_project;

public class Hesap {

	
		private String kullanici_adi;
		private String parola;
		private int bakiye;
		public Hesap(String kullanici_adi, String parola, int bakiye) {
			this.kullanici_adi = kullanici_adi;
			this.parola = parola;
			this.bakiye = bakiye;
		}
		public String getKullanici_adi() {
			return kullanici_adi;
		}
		public void setKullanici_adi(String kullanici_adi) {
			this.kullanici_adi = kullanici_adi;
		}
		public String getParola() {
			return parola;
		}
		public void setParola(String parola) {
			this.parola = parola;
		}
		public int getBakiye() {
			return bakiye;
		}
		public void setBakiye(int bakiye) {
			this.bakiye = bakiye;
		}
		
		public void paraYatir(int miktar) {
			this.bakiye = this.bakiye+miktar;
			System.out.println("Bakiyeniz: "+bakiye);
		}
		public void paraCek(int miktar) {
			if(miktar>bakiye) {
				System.out.println("Hesabinizda yeterli para yok! Bakiyeniz: "+bakiye);
				
			}else {
				bakiye=bakiye-miktar;
				System.out.println("Para cekme islemindan sonra kalan bakiyeniz: "+bakiye);
			}
		}
}
