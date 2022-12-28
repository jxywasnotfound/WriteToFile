import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class WriteToFile {

	public static void main(String[] args) {

		try {

			Scanner S = new Scanner(System.in);
			String s;
			String b;

			System.out.print("Filename: ");
			s = S.nextLine();

			File B = new File(s + ".txt");
			System.out.println("Created new file: " + B.createNewFile());

			System.out.print("Input: ");
			b = S.nextLine();

			FileWriter C = new FileWriter(s + ".txt");
			C.write(b);
			C.close();
			System.out.println("Finished.");
		}

		catch(IOException e) {
			System.out.println("Something occurred.");
		}

	}
}
