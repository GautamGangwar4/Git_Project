package Git;

import java.util.Scanner;

public class Natural_Decrement_sum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range of ntural number: ");
		int number=scanner.nextInt();
		
		int sum=0;
		for(int i=number; i>0; i--)
		{
			System.out.println("i: "+i);
			sum=sum+i;
		}
		System.out.println("Sum of all natural numbers is: "+sum);
		

	}

}
