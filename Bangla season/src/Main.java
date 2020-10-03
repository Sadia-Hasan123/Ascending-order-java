import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String season="";
		System.out.println("Enter the month in number:");
		Scanner i= new Scanner(System.in);
		int m=i.nextInt();
		switch(m) {
		
			case 1:
			case 2:
				season="Grismo";
				break;
			case 3:
			case 4:
				season="Borsha";
				break;
			case 5:
			case 6:
				season="Shorot";
				break;
			case 7:
			case 8:
				season="Hemonto";
				break;
			case 9:
			case 10:
				season="Shiit";
				break;
			case 11:
			case 12:
				season="Bsanta";
				break;
		}
System.out.println("The name of Bangla season: "+season);
	}

}
