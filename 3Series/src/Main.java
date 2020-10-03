import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,a=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				a=a-i;
			}
			else if(i%2==1) {
				a=a+i;
			}
			
		}
		System.out.print("The nth term is: "+a);
	}

}
