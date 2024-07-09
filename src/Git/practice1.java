package Git;

import java.util.Arrays;
import java.util.Collections;

public class practice1 {

	public static void main(String[] args) {
		
//		String ab ="my name is gautam";
//		String words[]=ab.split(" ");
//		int len=words.length;
//		StringBuffer reverse= new StringBuffer();
//		for(int i=len-1; i>=2; i--) {
//			reverse.append(words[i]);
//			if(i!=2) {
//				reverse.append(" ");
//			}
//		}
//		System.out.println("revers of string=" + reverse);
//		Integer b=10;
//		System.out.println(b);
		int a[]= {50, 28, 5, 88, 4, 28 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); //we use the arrays.tostring() method for print the array same.
		int secondhigh=a[a.length-2];
		System.out.println(secondhigh);
		System.out.println(a[1]);
	}

}
