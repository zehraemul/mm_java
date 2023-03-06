package training_project;

public class Training {

	private int burpee_count;
	private int pushup_count;
	private int situp_count;
	private int squad_count;
	
		public Training(int burpet_count, int pushup_count, int situp_count, int squat_count) {
		this.burpee_count = burpet_count;
		this.pushup_count = pushup_count;
		this.situp_count = situp_count;
		this.squad_count = squat_count;
	}

		public int getBurpee_count() {
			return burpee_count;
		}

		public void setBurpee_count(int burpet_count) {
			this.burpee_count = burpet_count;
		}

		public int getPushup_count() {
			return pushup_count;
		}

		public void setPushup_count(int pushup_count) {
			this.pushup_count = pushup_count;
		}

		public int getSitup_count() {
			return situp_count;
		}

		public void setSitup_count(int situp_count) {
			this.situp_count = situp_count;
		}

		public int getSquat_count() {
			return squad_count;
		}

		public void setSquat_count(int squat_count) {
			this.squad_count = squat_count;
		}
		
		public void makeMove(String moveType, int number ) {
			if(moveType.equals("Burpee")) {
				makeBurpee(number);
			}
			else if(moveType.equals("Pushup")) {
				makePushup(number);
			}
			else if(moveType.equals("Situp")) {
				makeSitup(number);
			}
			else if(moveType.equals("Squad")) {
				makeSquad(number);
			}else {
				System.out.println("Invalid Move Type!");
			}
		}
		
		public void makeBurpee(int number) {
			if(burpee_count==0) {
				System.out.println("No more Burpee move!");
			}
			if((burpee_count-number)<0) {
				System.out.println("Good Work!!");
				burpee_count=0;
				System.out.println("number of burpee: "+burpee_count);
			}else {
				burpee_count=burpee_count-number;
				System.out.println("number of burpee: "+burpee_count);
		
			}
		}
		
		public void makePushup(int number) {
			if(pushup_count==0) {
				System.out.println("No more Pushup move!");
			}
			if((pushup_count-number)<0) {
				System.out.println("Good Work!!");
				pushup_count=0;
				System.out.println("number of pushup: "+pushup_count);
			}else {
				pushup_count=pushup_count-number;
				System.out.println("number of pushup: "+pushup_count);
		
			}
		}
		
		public void makeSitup(int number) {
			if(situp_count==0) {
				System.out.println("No more Situp move!");
			}
			if((situp_count-number)<0) {
				System.out.println("Good Work!!");
				situp_count=0;
				System.out.println("number of situp: "+situp_count);
			}else {
				situp_count=situp_count-number;
				System.out.println("number of situp: "+situp_count);
		
			}
		}
		
		public void makeSquad(int number) {
			if(squad_count==0) {
				System.out.println("No more Squad move!");
			}
			if((squad_count-number)<0) {
				System.out.println("Good Work!!");
				squad_count=0;
				System.out.println("number of squad: "+squad_count);
			}else {
				squad_count=squad_count-number;
				System.out.println("number of squad: "+squad_count);
		
			}
		}
		public boolean isTrainingFinish() {
			return (burpee_count==0 && pushup_count==0 && situp_count==0 && squad_count==0);
			
		}
		
}
