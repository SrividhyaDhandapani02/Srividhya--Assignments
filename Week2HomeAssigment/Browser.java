package Week1.day2;

public class Browser {

	public void launchBrowser(String browsername)
	{
		System.out.println("Browser launched successfully");
    
	}
	public void LoadURL()
	{
		System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
		
Browser lb=new Browser();
lb.launchBrowser("Chrome");
lb.LoadURL();
	}

}
