package Week1.day2;

public class CheckNumberIsPositive {
			public int version = 10;
			public void CheckNumber() {
				if(version>0) {
					System.out.println("The number is positive");
				}
				else if (version<0) {
					System.out.println("The number is negative");
								}
				else {
					System.out.println("The number is Zero");
				}
			}
			
		public static void main(String[] args) {
			CheckNumberIsPositive num=new CheckNumberIsPositive();
			num.CheckNumber();
			
		}
	
			
}		



