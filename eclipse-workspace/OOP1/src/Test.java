
public class Test {
	
	public static void main(String[] args) {
		
		Araba araba1 =  new Araba();
		araba1.setModel("Renault");
		araba1.setKapi_sayisi(-2);
		//System.out.println("arabanin modeli : "+araba1.getModel());
		
		
		/*Araba araba2 = new Araba();
		
		
		araba1.renk = "kirmizi";
		araba1.kapi_sayisi = 4;
		araba1.model = "Renault";
		araba1.tekerlek_sayisi=4;
		araba1.motor = "16V";
		
		araba2.tekerlek_sayisi=-2;
		*/
		//System.out.println(araba1.motor);
		
		/*Araba araba2;
		araba2.setKapi_sayisi(4)*/;//the local variable araba2 may not have been initialzed
	}
}
