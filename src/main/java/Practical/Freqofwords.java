package Practical;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Freqofwords {

	public static void main(String[] args) throws IOException {

		String s = null;
		int maxCount = 0;
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Amita_Extraprenures.txt"));
			while((s=br.readLine())!=null)
			{
				String arr[]=s.split("");
				int count=arr.length;
				if(count>maxCount){
					maxCount=count;
					}	
				}
				System.out.println(maxCount);

			}

	}


