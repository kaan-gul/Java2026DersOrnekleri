import java.util.Scanner;

public class o8 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double sayi1, sayi2, sonuc;

        String islem;

        System.out.print("1.Sayı:");
        sayi1 = giris.nextDouble();

        System.out.print("2.Sayı:");
        sayi2 = giris.nextInt();// double = int

        giris.nextLine();

        System.out.print("İşlem(+,-,*,/): ");
        islem = giris.nextLine();

        if (islem.equals("+")) {
            sonuc = sayi1 + sayi2;
        }
        else if (islem.equals("-")) {
            sonuc = sayi1 - sayi2;
        }
        else if (islem.equals("*")) {
            sonuc = sayi1 * sayi2;
        }
        else {
            sonuc = sayi1 / sayi2;
        }

        System.out.println("Sonuc= "+sonuc);
    }
}
