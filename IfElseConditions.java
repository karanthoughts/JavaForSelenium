package JavaSessions;

public class IfElseConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=20;
		
	//	if(a>b) {
		//	System.out.println("a is greater than b");
	//	}
		//else {
		//	System.out.println("b is greater than a");
	//	}
		
//		if(a==b) {
//			System.out.println("both are equal");
//		}
		
//		if(false) {
//			System.out.println("hi");
//		}
//		else {
//			System.out.println("bye");
//		}
		
//		boolean flag=true;
//		if(flag) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
		
//		//nested if
//		int number =200;
//		if(number<=100) {
//			if(number>=90) {
//				System.out.println("grade a");
//			}
//			if(number>=75) {
//				System.out.println("grade b");
//			}
//		}
//		else {
//			System.out.println("invalid number");
//		}
		
		
//		String browser="chrome";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch ff");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		if(browser.equals("ie")) {
//			System.out.println("launch ie");
//		}
//		else {
//			System.out.println("please pass the right browser");
//		}
		
		String browser="firefox";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch ff");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else if(browser.equals("ie")) {
			System.out.println("launch ie");
		}
		else {
			System.out.println("please pass the right browser");
		}
		
		
		
	}

}
