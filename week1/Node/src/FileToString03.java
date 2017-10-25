import java.io.*;

public class FileToString03 {
  public static void main (String[] args) throws IOException {
    String data = FileToString("./awmt.txt");
    String str = cleanText(data);

    String[] wordArray = str.split(" ");

    for (String s : wordArray) {
      System.out.println(s);
    }
  }

  public static String fileToString (String fileName) {
    String result = "";
    try {
      FileInputStream file = new FileInputStream(fileName);
      byte[] b = new byte[file.available()];
      file.read(b);
      file.close();
      result = new String(b);
      System.out.println(result);
    } catch (Exception e) {
      System.out.println("oops");
    }
    return result;
  }

  public static String cleanText (String s) {
    s = s.replaceAll("\\p{Punct}", "");
    s = s.replaceAll("\\s+", " ");
    return s;
  }
}
