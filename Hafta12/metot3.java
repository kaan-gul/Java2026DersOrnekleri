import java.util.Scanner;

public class metot3 {
    public static void main(String[] args) {
        // karelerinToplami(3);
        // 3*3+2*2+1*1

        Scanner giris = new Scanner(System.in);
        int sayi;
        int hesaplananDeger;
        System.out.println("Sayı Gir:");
        sayi = giris.nextInt();

        hesaplananDeger = karelerinToplami(sayi);
        System.out.println(hesaplananDeger);

        hesaplananDeger = karelerinToplami(-3);
        System.out.println(hesaplananDeger);
    }

    public static int karelerinToplami(int sayi) {
        int sonuc = 0;
        if (sayi <= 0) {
            System.out.println("Hesaplama işlemi yapılamaz.");
            sonuc = -1;
        } else if (sayi == 1)
            sonuc = sayi * sayi;// sonuc=1
        else
            sonuc = sayi * sayi + karelerinToplami(sayi - 1);

        return sonuc;
    }

    public static int karelerinToplami_V2(int sayi) {
        if (sayi <= 0) {
            System.out.println("Hesaplama işlemi yapılamaz.");
            return -1;
        } else if (sayi == 1)
            return sayi * sayi;// sonuc=1
        else
            return sayi * sayi + karelerinToplami(sayi - 1);
    }
}
