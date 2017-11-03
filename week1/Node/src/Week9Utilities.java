
/**
 * @author Zachary Christensen
 */
import java.io.*;
import java.util.*;

public class Week9Utilities {
	private String fileName;
	private String result;

	public Week9Utilities() {
		setFileName("./awmt.txt");
	}

	public Week9Utilities(String fileName) {
		setFileName(fileName);
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		result = "";
	}

	public String fileToString() {
		try {
			FileInputStream file = new FileInputStream(fileName);
			byte[] b = new byte[file.available()];
			file.read(b);
			file.close();
			result = new String(b);
			// System.out.println(result);
		} catch (Exception e) {
			System.out.println("Something went wrong compadre..");
		}
		return result;
	}

	public String cleanText() {
		String file = fileToString();
		file = file.replaceAll("\\p{Punct}", "");
		file = file.replaceAll("\\p{Digit}", "");
		file = file.replaceAll("\\W+", " ");
		file = file.replaceAll("\\s+", " ");
		return file;
	}
}
