package Practical;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		String str = null;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\brahmakumari.txt"));
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

	}

}
