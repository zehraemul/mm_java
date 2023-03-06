package bolum5;
import java.util.Scanner;
public class bolum5 {

	public static void main(String[] args) {
		
		System.out.print("bir sayi girin");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		int sum=0;
		
		do {
			sum +=sayi%10;
			sayi /=10;
			
		}while(sayi>0);
			
		
		System.out.println("sayinin rakamlari toplami : " +sum);
		
		//Scanner scanner = new Scanner(System.in);
		
		int giris_hakki =3;
		String kullanici_adi = "zehraemul";
		String parola = "Zehrabengu.9";
		
		System.out.print("kullanici sistemine hosgeldiniz...");
		while(true) {
			System.out.print("Kullanici adi : ");
			String kullanici_Adi = scanner.nextLine();
			System.out.println("Sifre : ");
			String sifre = scanner.nextLine();
			
		if(kullanici_adi.equals(kullanici_Adi) && sifre.equals(parola)) {
			System.out.println("hosgeldiniz....");
			break;
		}
		
			
		}
	}

}
