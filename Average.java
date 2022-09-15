import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int number1 = scan.nextInt();
		System.out.println("Enter number 2 : ");
		int number2 = scan.nextInt();
		System.out.println("Enter number 3 ; ");
		int number3 = scan.nextInt();
		int sum = number1 + number2 + number3;
		int avg=sum/3;
		System.out.println("The average is : "+ avg);			
	}

}
