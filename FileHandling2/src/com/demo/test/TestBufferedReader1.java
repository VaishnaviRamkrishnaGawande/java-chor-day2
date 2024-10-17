// Java program illustrating ready() and close() method

import java.io.*;
public class TestBufferedReader1
{
	public static void main(String[] args)
	{

		try
		{
			// initializing FileInputStream
			FileInputStream geek = new FileInputStream("ABC.txt");

			// Initializing InputStreamReader object
			InputStreamReader in_strm = new InputStreamReader(geek);

			int t;
			while((t=in_strm.read())!= -1)
			{
				// convert the integer true to character
				char r = (char)t;
				System.out.println("Character : "+r);

				// check if the stream in_strm ready
				boolean b = in_strm.ready();
				// Use of ready() methods
				System.out.println("Ready? : "+b);

			}
			
			// Use of close() method to Close InputStreamReader
			in_strm.close();
			
			// Closing FileInputStream
			geek.close();
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("NO Such File Exists");
		}
		catch (IOException except)
		{
			System.out.println("IOException occurred");
		}
	}
}
