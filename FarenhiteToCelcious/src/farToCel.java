import java.util.Scanner;

public class farToCel {
	public void f() {
	Scanner input = new Scanner(System.in); 
	
	double fahrenheit ;
	double celcious;
	System.out.println("Input a Degree in Fahrenheit:");
	fahrenheit= input.nextDouble();
	celcious=((5*(fahrenheit-32.0)))/9;
	System.out.println(fahrenheit+"degree fahrenheit is equal to"+celcious+"in Celcious");
	}
}
