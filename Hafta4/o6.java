import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1, sayi2, sonuc=0;

        char islem;

        System.out.print("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.print("2.Sayı:");
        sayi2 = giris.nextInt();

        System.out.print("İşlem(+,-,*,/): ");
        islem = giris.next().charAt(0);

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Hatalı veri girişi yapıldı");
                break;
        }
        System.out.println("Sonuc= " + sonuc);
    }
}
