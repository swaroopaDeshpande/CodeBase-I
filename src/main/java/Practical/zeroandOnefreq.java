package Practical;

public class zeroandOnefreq {

	public static void main(String[] args) {
		// Write 0 and 1 separately from 10011101101 and find the frequency of
		// each.
		String str="0100111011011";
		int count=0;
		int counter=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='0')
			{
				count++;
			}
			else if (ch=='1')
			{
				counter++;
			}
		}
		System.out.println(count);
		System.out.println(counter);
	}

}
