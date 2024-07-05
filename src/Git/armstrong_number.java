package Git;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("please enter the number");
		int num = scanner.nextInt();
		
		int temp=num;
		int mod, result=0;
		
		for(int i=1; i<=num;) {
			mod= num%10;
			result=result+mod*mod*mod;
			num=num/10;
			
		}
		if(temp==result) {
			System.out.println("number is armstrong number");
		}
		else {
			System.out.println("number is not armstrong number");
	}

}
}