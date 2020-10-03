import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int base,exponent;
		long r=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the base: ");
		base=s.nextInt();
		System.out.println("Enter the power: ");
		exponent=s.nextInt();
		
	
for(int i=1;i<=exponent;i++) {
	r=r*base;
}
System.out.println("The power is: "+r);
}
}
