import java.io.*;

public class FileToString {
  public static void main (String[] args) throws IOException {
    FileInputStream file = new FileInputStream(args[0]);
    byte[] b = new byte[file.available()];
    String result;

    System.out.println("Number of bytes in this file = " + file.available());
    file.read(b);
    file.close();
    result = new String(b);
    System.out.println(result);
  }
}
