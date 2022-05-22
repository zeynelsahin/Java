

public class JavaUygulama1 {
    public static void main(String[] args) {
        int number = 1;
        int remainder = number % 2;
        System.out.println(remainder);
        if (remainder == 1) {
            System.out.println("Sayı asal");
        } else {

            System.out.println("Sayı asal değildir");
        }
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;
        }   
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayı asal");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }
}
