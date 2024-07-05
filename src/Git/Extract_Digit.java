package Git;
// Extract digit from a number
import java.util.Scanner;

public class Extract_Digit {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scanner.nextInt();
		int mod;
		
		for(int i=1; i<=number;)
		{
			mod=number%10;
			System.out.print(mod+" ");
			number=number/10;
		}
		

	}

}
