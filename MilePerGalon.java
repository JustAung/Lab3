import java.util.Scanner;

public class MilePerGalon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		float number1 = scan.nextInt();
		System.out.println("Enter number 2 : ");
		float number2 = scan.nextInt();
		System.out.println("The MPG is : " + (number1 /= number2));
	}

}
