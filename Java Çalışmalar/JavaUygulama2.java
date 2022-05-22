public class JavaUygulama2 {
    public static void main(String[] args) {
        char harf = 'A';
        switch (harf) {
        case 'A', 'I', 'O', 'U':
            System.out.println("Kalaın sesli harf");
            break;
        default:
            System.out.println("İnce sesli harf");
        }

        int number = 6;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println("Mükemmel Sayı");
        } else {
            System.out.println("Mükemmel sayı değildir");
        }
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
            System.out.println("var");
        } else {
            System.out.println("Yok");
        }

        
    }
}
