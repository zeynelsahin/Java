public class JavaMetodlar {
    public static void main(String[] args) {
        sayiBulma();
    }

    public static void sayiBulma() {
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacak = 6;
        boolean result = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                result = true;
                break;
            }
        }
        if (result) {
            mesajVer(aranacak);
        } else {
            System.out.println("Yok");
        }
    }

    public static void mesajVer(int aranacak) {
        System.out.println("var : " + aranacak);

    }
    
}
