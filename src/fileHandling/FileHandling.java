package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("D://testdata.txt");
		
		FileWriter fw = new FileWriter("D://td.txt");
		
		BufferedReader reader = new BufferedReader(f);
		
		BufferedWriter writer = new BufferedWriter(fw);
		
		String s;
		
		try {
			while((s=reader.readLine())!=null) {
				System.out.println(s);
				
				writer.write(s);
				writer.newLine();
				//System.out.println(s);
			}
		}
		catch(IOException e) {
			System.out.println("IOException"+e);
		}
		
		reader.close();
		writer.close();
	}

}
