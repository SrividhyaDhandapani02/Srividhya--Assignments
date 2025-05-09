package Week1.day2;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 121;
		int output=0;

        for (int i = input; i > 0; i /= 10) {
        	
        
            output = output*10+ i%10;
            
                        
        }
        if (input==output) {
        	System.out.println("the given input is a Palindrome");
        }else {
        	System.out.println("the given input is a not Palindrome");
        }
        
	
	}

}
