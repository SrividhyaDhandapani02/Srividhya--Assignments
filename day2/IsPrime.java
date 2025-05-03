package Week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 13;
 boolean Isnotprimeflag=false ;

		for (int i=2;i<input-1;i++) {
			
			if (input%i==0) {
				Isnotprimeflag=true;
				System.out.println(i);
				break;
			}
				
			
		}
		if(Isnotprimeflag==true) {
			System.out.println("This number is not a Prime");
			} else {
				System.out.println("This number is a Prime");
			}
		

	}

}
