import java.io.*;
import java.nio.file.*;

public class IO_NIO {
    public static void main(String[] args) {
        try {
            // IO Stream
            FileOutputStream fout = new FileOutputStream("sample.txt");
            String data = "Welcome to Java IO Stream";
            fout.write(data.getBytes());
            fout.close();

            FileInputStream fin = new FileInputStream("sample.txt");
            int i;

            System.out.println("IO Stream Output:");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();

            // NIO Stream
            Path path = Paths.get("sample.txt");
            String nioData = "Welcome to Java NIO Stream";

            Files.write(path, nioData.getBytes());

            String content = new String(Files.readAllBytes(path));

            System.out.println("\n\nNIO Stream Output:");
            System.out.println(content);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
