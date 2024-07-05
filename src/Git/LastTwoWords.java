package Git;

public class LastTwoWords {

	public static void main(String[] args) {
		String name="my name is gautam";
		String words[]=name.split(" ");
		int len=words.length;
		
		StringBuffer reverse=new StringBuffer();
		for(int i=len-1; i>=2; i--)
		{
			reverse.append(words[i]);
			if(i!=2)
			{
				reverse.append(" ");
			}
		}
		System.out.println("Reverse of two words ="+reverse);
	}

}
