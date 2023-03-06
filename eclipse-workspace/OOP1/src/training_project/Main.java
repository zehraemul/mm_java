package training_project;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to TraningApp!");
		
		String moveTypes = "Burpee\n"+"Pushup\n"+"Situp\n"+"Squad\n";
		
		System.out.println(moveTypes);
		
		System.out.println("Make a traning set:");
		
		System.out.println("Burpee number?");
		int burpee = scanner.nextInt();
		
		System.out.println("Pushup number?");
		int pushup = scanner.nextInt();
		
		System.out.println("Situp number?");
		int situp = scanner.nextInt();
		
		System.out.println("Squad number?");
		int squad = scanner.nextInt();
		
		scanner.nextLine();
		
		Training training = new Training(burpee,pushup,situp,squad);
		
		System.out.println("Your training begins...");
		
		while(training.isTrainingFinish()==false) {
			
			System.out.println("Move type?(burpee,pushup,situp,squad)");
			
			String type = scanner.nextLine();
			
			System.out.println("How many of these moves do you want to make?");
			
			int num = scanner.nextInt();
			scanner.nextLine();
			
			training.makeMove(type, num);
			
			}
		}

	
	


}
