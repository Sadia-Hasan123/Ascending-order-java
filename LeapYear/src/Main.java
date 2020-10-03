import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	
		Scanner i= new Scanner(System.in);
		int year= i.nextInt();
		if(year%4==0) {
			
			if(year%100!=0 || year%400==0) {
			
			System.out.println("This is leapyear");
		}
		else {
			System.out.println("This is not leapyear");
		}
		
		
	}
	}

}
