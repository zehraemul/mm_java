package constructor1;

public class Test {
public static void main(String[] args) {
	//Account account1=new Account();
	//System.out.println(account1.getIsim());4
	
	Account account2=new Account("Ahmet Can","example@gmail.com","989544545");
	/*System.out.println(account2.getEmail());
	System.out.println(account2.getIsim());
	System.out.println(account2.getBakiye());*/
	account2.bilgileriGoster();
	
}
}
