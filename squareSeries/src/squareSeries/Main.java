package squareSeries;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,i,sum=0,odd=1;
		System.out.print("Input: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
        for(i=1;i<=n;i++) {
       
        	odd=2*i-1;
        	sum=sum+(odd*odd);
        	
       }
        System.out.println(n+"th term is:"+sum);
	}

}
