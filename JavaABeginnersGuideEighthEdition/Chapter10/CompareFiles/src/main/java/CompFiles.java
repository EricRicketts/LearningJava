import java.io.*;

public class CompFiles {
    public static void main(String args[]) {
        int i, j;

        if (args.length != 2) {
            System.out.println("Usage: CompFiles file1 file2");
            return;
        }

        try (var file1 = new FileInputStream(args[0]); var file2 = new FileInputStream(args[1])) {
            do {
                i = file1.read();
                j = file2.read();
                if (i != j) {
                    break;
                }
            } while (i != -1 && j != -1);
            if (i != j) {
                System.out.println("Files differ");
            } else {
                System.out.println("Files are the same");
            }
        } catch (IOException exec) {
            System.out.println("IO Error: " + exec);
        }
    }
}
