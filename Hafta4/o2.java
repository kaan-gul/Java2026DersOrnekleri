import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1=0, sayi2=0, sonuc=0;

        char islem;

        System.out.print("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.print("2.Sayı:");
        sayi2 = giris.nextInt();

        System.out.print("İşlem(+,-,*,/): ");
        islem = giris.next().charAt(0);

        if (islem == '+') {
            sonuc = sayi1 + sayi2;
        }
        if (islem == '-') {
            sonuc = sayi1 - sayi2;
        }
        if (islem == '*') {
            sonuc = sayi1 * sayi2;
        }
        if (islem == '/') {
            sonuc = sayi1 / sayi2;
        }

        System.out.println("Sonuc= "+sonuc);

    }
}
