public class JavaMethod2 {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj);
        int toplam = topla2(2, 3, 5, 6, 7, 8, 9, 10);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla() {
        return 1;
    }

    public static int topla2(int... sayilar) {
        int topla = 0;
        for (int sayi : sayilar) {
            topla += sayi;
        }
        return topla;

    }

}
