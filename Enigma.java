import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Enigma
{
	
	public static void main(String [] args)
	{
		  // read in the command line arguments

		  // declare the input array 
		  ArrayList<Integer> input = new ArrayList<Integer> ();
		       
		  // call readFile
		      
		  // initializeRotors

		  // then encrypt and append to file
	}
	
	
	/**
	 * Reads the contents of the input file and stores unicode values into
	 * the ArrayList which is also passed in.
	 * @param name The filename of the input file.
	 * @param list The ArrayList into which unicode values should be stored.
	 */
	public static void readFile(String name, ArrayList<Integer> list)
	{
		File file = new File(name);	
		Scanner input = null;
		try
		{
			input = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(" Cannot open " + name );
			System.exit(1);
		}
	
		while( input.hasNextLine() )
		{
			String s = input.nextLine();
			for( int i = 0; i < s.length(); i++)
				list.add((int)s.charAt(i));
		}
	}

  /**
   * Writes the given character to the output file. If the file does not exist,
   * it is created. If it does exist, the character is appended.
   * @param ch The character to be written.
   */
	public static void writeToFile(char ch)
	{
	  //TODO If you choose not to make output a class field, it should be added
	  // to the signature, and the javadoc updated. 
		String pathname = output;
		Writer writer = null;	
	
		try
		{
			writer = new FileWriter(pathname, true);
		}
		catch (IOException ex)
		{
			System.out.println("Cannot create/open " + pathname );
			System.exit(1); //quit the program
		}
	
		PrintWriter output = new PrintWriter(writer);
		output.print(ch);
		output.close();
	}

}
