import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class UpperCase {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File(args[0] + ".java"));
		PrintStream outFile = new PrintStream(new File(args[0] + ".java"));
		while (file.hasNext()) {
			String line = file.nextLine();
			line = line.replace("	", "    ");
			outFile.println(line);
		}
	}
}