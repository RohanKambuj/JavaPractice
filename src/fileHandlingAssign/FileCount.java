package fileHandlingAssign;

import java.io.*;


public class FileCount {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D://filecount.txt");
		
		BufferedReader reader = new BufferedReader(fr);
		
		String s;
		int linecount = 0, wordcount = 0;
		
		
		try {
			while((s=reader.readLine())!=null) {
				linecount++;
				
				String[] word = s.split(" ");
				wordcount = wordcount+word.length;
				
				if(s.contains("Selenium") || s.contains("selenium")) {
						System.out.println(s);
					}
				}
			}
		
		finally {
			System.out.println("No. of lines in file are: "+linecount);
			System.out.println("No. of words in file are: "+wordcount);
		}
		
		reader.close();

	}

}
