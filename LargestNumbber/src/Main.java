import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count,temp,i,j;
		System.out.println("Enter how many numbers do you want to take input: ");
		Scanner c= new Scanner(System.in);
		count=c.nextInt();
		
		int a[]= new int[count];
		System.out.println("Enter the Numbers: ");
		for(i=0;i<count;i++) {
			a[i]=c.nextInt();
		}
		for (i=0;i<count;i++) {
			for(j=i+1;j<count;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			 }
		  }
		}
		System.out.println("Largest Number is: "+a[count-1]+" ");
		
			
	
	}

}
