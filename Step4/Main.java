import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner fileIn = new Scanner(new File("/Users/david/Projects/FileIOJava/Step4/input.txt"));
            while (fileIn.hasNext()) {
                int sum = 0;
                String lineIn = fileIn.nextLine();
                System.out.println(lineIn);
                    sum+= Integer.parseInt(lineIn);
                System.out.println(sum);
                }
        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }
}