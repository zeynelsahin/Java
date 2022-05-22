import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // int[] sayilar = new int[] { 1, 2, 3 };
        // sayilar = new int[4];
        // System.out.println(sayilar[0]);

        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add("Ankara");
        System.out.println(sayilar.size());
        System.out.println(sayilar.set(0, 100));
        sayilar.remove(0);
        // sayilar.clear();
        System.out.println("-------Değerler-------");
        for (var sayi : sayilar) {
            System.out.println(sayi);
        }

    }
}
