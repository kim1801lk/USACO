
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class USACOword {

	public static void main(String[] args)throws IOException {
		
		
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		
		
		String [] input = in.readLine().split(" ");
		int numWords = Integer.parseInt(input [0]);
		int numChar = Integer.parseInt(input [1]);
		

		
		String [] essay = in.readLine().split(" ");
		
		int currChar = 0;
		
		for (int i = 0; i < essay.length; i++) {
			
		
			
			if (currChar + essay[i].length() > numChar) {
				out.println();
				currChar = 0;
			}
			
		
			
			out.print(essay[i] + " "); // fails test cases because there's a space at the end of each line...
			currChar = currChar + essay[i].length();
		
		}
		
		in.close();
		out.close();
		

	}

}