import java.util.Scanner;

public class o5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double sayi1, sayi2, sonuc;

        char islem;

        System.out.print("1.Sayı:");
        sayi1 = giris.nextDouble();

        System.out.print("2.Sayı:");
        sayi2 = giris.nextInt();// double = int

        System.out.print("İşlem(+,-,*,/): ");
        islem = giris.next().charAt(0);

        if (islem == '+') {
            sonuc = sayi1 + sayi2;
        }
        else if (islem == '-') {
            sonuc = sayi1 - sayi2;
        }
        else if (islem == '*') {
            sonuc = sayi1 * sayi2;
        }
        else {
            sonuc = sayi1 / sayi2;
        }

        System.out.println("Sonuc= "+sonuc);
    }
}
