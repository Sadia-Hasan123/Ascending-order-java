import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,j;
		Scanner S= new Scanner(System.in);
		i=S.nextInt();
		long f=1;
		for(j=1;j<=i;j++) {
			f=f*j;
		}
  System.out.println(f);
	}

}
