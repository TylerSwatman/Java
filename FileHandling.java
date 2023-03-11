package FileHandling;

import java.io.File;

public class Files {

    public static void main(String[] args) {

        File file = new File("C:/Users/ZombieSwater/OneDrive/Documents/project/.vscode/FileHandling/text.txt");

        if (file.exists()) {
            System.out.println("hi");
        } else {
            System.out.println("no");
        }
    }
}


import java.util.InputMismatchException;
import java.util.Scanner;

public class Handling {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            try {

                System.out.println("Enter a whole number to divide");
                int x = scanner.nextInt();

                System.out.println("Enter a whole number to divide by:");
                int y = scanner.nextInt();

                int z = x / y;

                System.out.println("result: " + z);
            } catch (ArithmeticException e) {
                System.out.println("you cannon divide by 0");
            } catch (InputMismatchException e) {
                System.out.println("Whole numbers only");
            }
        }
    }
}


import java.io.FileReader;
import java.io.IOException;

public class reader {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader(
                "C:\\Users\\ZombieSwater\\OneDrive\\Documents\\project\\.vscode\\FileHandling\\text.txt")) {
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        }

        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
