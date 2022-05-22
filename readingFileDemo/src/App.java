import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class App {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(
                    new FileReader("C:\\Users\\zynls\\Masaüstü\\Java\\readingFileDemo\\src\\sayilar.txt"));

            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam = " + total);
        } catch (FileNotFoundException e) {
            System.out.println("Hata");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception exception) {

            }

        }

    }
}
