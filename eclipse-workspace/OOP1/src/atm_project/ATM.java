package atm_project;
import java.util.Scanner;
public class ATM {
	
	public void calis(Hesap hesap) {
		Login login = new Login();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bankamiza hosgeldiniz..");
		
		System.out.println("Kullanici Girisi Sayfasi:");
			
		int giris_hakki=3;
		
		while(true) {
			if(login.login(hesap)) {
				System.out.print("Giris Basarili..");
				break;
			}else {
				System.out.println("Giris Basarisiz..");
				giris_hakki=giris_hakki-1;
				System.out.println("Kalan giris hakkiniz: "+giris_hakki);
				
			}
			if(giris_hakki==0) {
				System.out.println("Giris hakkiniz bitti..");
				return;
			}
		}
		
		String islemler = "1.Bakiye sorgulama\n"+
						  "2.Para yatirma\n"+
						  "3.Para cekme\n"+
						  "4. Cikis icin q'ya basin\n";
		System.out.println(islemler);
		while(true) {
			String islem = scanner.nextLine();
			System.out.println("İslem seciniz : ");
			
			if(islem.equals("q")) {
				System.out.println("ATM'den cikis yapilmistir...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Bakiyeniz : "+hesap.getBakiye());
			}
			else if(islem.equals("2")) {
				
;				System.out.println("Yatirmak istediginiz tutar : ");
				int miktar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(miktar);
				
			}
			else if(islem.equals("3")) {
				System.out.println("Cekmek istediginiz tutar : ");
				int miktar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraCek(miktar);
				
				
			}else {
				System.out.println("Gecersiz İslem..!");
			}
			
		}
		
	}
}
