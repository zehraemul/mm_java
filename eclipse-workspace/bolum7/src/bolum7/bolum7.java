package bolum7;
import java.util.Scanner;
public class bolum7 {
	public static void selamlama() {
		System.out.println("hello");
		System.out.println("world");
	}
	public static void faktoriyel() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayi girin: ");
		int sayi = scanner.nextInt();
		int faktoriyel =1;
		while(sayi>0) {
			faktoriyel = faktoriyel*sayi;
			sayi--;
		}
		System.out.println("faktroiyel : " +faktoriyel);
		
	}

	public static void main(String[] args) {
		selamlama();
		faktoriyel();

	}

}
