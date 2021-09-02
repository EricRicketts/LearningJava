import java.io.*;
import java.util.Scanner;

public class ReadBytes {
    public static void main(String args[]) throws IOException {
        byte[] data = new byte[10];
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter some characters:");
            System.in.read(data);
            System.out.print("You entered: ");
            for (byte d: data) {
                System.out.print((char) d);
            }
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("Quit?(y|n): ");
            char ch = sc.next().charAt(0);
            if (ch == 'y') quit = true;
            System.out.println();
            data = new byte[10];
        }
    }
}
