package bolum4;
import java.util.Scanner;
public class bolum4 {

	public static void main(String[] args) {
		
	System.out.println("hello");
	System.out.println("world");
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter name:");
	String name = scanner.nextLine();
	System.out.println("Your name -> " +name);
		
		System.out.println("BKİ HESAPLAMA UYGULAMASINA HOSGELDİNİZ...");
		//Scanner scanner = new Scanner(System.in);
		System.out.print("Kilo girin : ");
		float kilo = scanner.nextFloat();
		System.out.print("Boy girin : ");
		float boy = scanner.nextFloat();
		float bki = kilo / (boy*boy);
		System.out.print("bki degeriniz : " + bki);
		
		
		System.out.println("SWAP UYGULAMASINA HOSGELDİNİZ...");
		int a =4;
		int b=10;
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		System.out.print("a - b : " +a+ " - " +b);
	}

}
