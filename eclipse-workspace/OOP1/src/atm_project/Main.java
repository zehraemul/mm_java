package atm_project;

public class Main {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Hesap hesap = new Hesap("zehraemul","070319", 2000);
		
		atm.calis(hesap);
		
		System.out.println("Hesaptan cikis yapiliyorr..");

	}

}
