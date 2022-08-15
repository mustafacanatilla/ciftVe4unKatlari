import java.util.Scanner;

public class ciftSayilarinVe4unKat {
    public static void main(String[] args) {

        int number, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz:");
            number = input.nextInt();
            if (number % 2 == 0 && number % 4 == 0 ) {
                total += number;
            }

        } while (number > 0);
        System.out.println("Çift Sayıların Toplamı:" + total);

    }
}
