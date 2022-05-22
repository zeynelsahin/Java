import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // createFile();
        // getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    private static void createFile() {
        File file = new File("C:\\Users\\zynls\\Masaüstü\\Java\\workingWithFiles\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void getFileInfo() {

        File file = new File("C:\\Users\\zynls\\Masaüstü\\Java\\workingWithFiles\\files\\students.txt");

        if (file.exists()) {
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi  : " + file.canWrite());
            System.out.println("Dosya okunabilir mi  : " + file.canRead());
            System.out.println("Dosya boyutu (byte) : " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\zynls\\Masaüstü\\Java\\workingWithFiles\\files\\students.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("C:\\Users\\zynls\\Masaüstü\\Java\\workingWithFiles\\files\\students.txt", true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            // TODO Auto-generated catch block
        }

    }
}
