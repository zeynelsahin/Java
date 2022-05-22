import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Dünya");
        sehirler.add("Cennet");
        sehirler.add("AUzay");

        // sehirler.remove("Dünya");
        sehirler.add("Adana");
        Collections.sort(sehirler);
        for (String s : sehirler) {
            System.out.println(s);
        }

    }
}
