import java.util.Scanner;

import matematik.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız : ");

        String isim = scanner.nextLine();
        System.out.println("Merhaba " + isim);
        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2, 3);
        Logaritma logaritma = new Logaritma();
        
    }
}
