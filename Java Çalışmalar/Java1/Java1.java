package Java1;

/**
 * Java1
 */
public class Java1 {

    public static void main(String[] args) {
        int ogrenciSayisi = 12;
        String message = "Students      : " + ogrenciSayisi;
        System.out.println(message);
        System.out.println(message);
        System.out.println("asdas");
        System.out.println("asdas");
        System.out.println("asdas");
        System.out.println("asdas");
        System.out.println(" ");

        boolean dogruMu = false;
        if (dogruMu) {
            System.out.println("dogru");
        } else {
            System.out.println("Yanlış");
        }

        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;
        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println(enBuyuk);

        char grade = 'B';
        switch (grade) {
        case 'A':
            System.out.println("Mükemmel : Geçtiniz");
            break;
        case 'B', 'C':
            System.out.println("İyi : Geçtiniz");
            break;
        case 'D':
            System.out.println("Fena değil: Geçtiniz");
            break;
        case 'F':
            System.out.println("Malesef Kaldınız");
            break;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        System.out.println("Dögü Bitti");

        int i = 1;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
        System.out.println("While Döngüsü Bitti");

        int j = 9;
        do {

            System.out.println(j);
            j++;
        } while (j < 10);

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";

        for (int k = 0; k < ogrenciler.length; k++) {
            System.out.println(ogrenciler[k]);
        }
        System.out.println("--------------");
        for (String s : ogrenciler) {
            System.out.println(s);
        }

        double[] myList = { 1.2, 1.3, 4.3, 5.7 };
        double total = 0;
        double max = myList[0];
        for (double x : myList) {
            System.out.println(x);
            total += x;
            if (max < x)
                max = x;

        }

        System.out.println(total);
        System.out.println(max);

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurda";
        sehirler[2][2] = "Gaziantep";

        for (int k = 0; k <= 2; k++) {
            System.out.println("-----------");
            for (int k2 = 0; k2 <= 2; k2++) {
                System.out.println(sehirler[k][k2]);
            }

        }

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("Eleman Sasyısı: " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));// 5.elemanı bulma

        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("l"));
        char[] chars = new char[5];
        mesaj.getChars(0, 5, chars, 0);
        System.out.println(chars);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));

        System.out.println(mesaj.replace("ü", "u"));
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());// Baştaki ve sondaki boşlukları atar

    }

}