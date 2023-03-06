package atm_project;
import java.util.Scanner;
public class Login {
	public boolean login(Hesap hesap) {
		Scanner scanner = new Scanner(System.in);
		String kullanici_adi;
		String parola;
		
		System.out.println("Kullanici adini girin:");
		kullanici_adi=scanner.nextLine();
		System.out.println("Parolayi girin:");
		parola=scanner.nextLine();
		
		if(hesap.getKullanici_adi().equals(kullanici_adi)&& hesap.getParola().equals(parola)){
			System.out.println("Basarili bir sekilde giris yaptiniz!!");
			return true;
		}else {
			System.out.println("Lutfen giris bilgilerinizi kontrol edin!!");
			return false;
		}
				
	}
}

