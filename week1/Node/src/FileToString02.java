import java.io.*;

public class FileToString02 {
  public static void main (String[] args) throws IOException {
    String data = FileToString("./awmt.txt");
    System.out.println(data);
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
}
