package Week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Range=8,FirstNbr=0,SecondNbr=0,Fibonocci;

		for(int i=1;i<Range;i++) {
			if(i==1) {
				FirstNbr=0;
				SecondNbr=1;
				System.out.println(FirstNbr);
				System.out.println(SecondNbr);

			}else {
				Fibonocci= FirstNbr + SecondNbr;
				FirstNbr=SecondNbr;
				SecondNbr=Fibonocci;
				System.out.println(Fibonocci);
			}
			
		}

	}

}
