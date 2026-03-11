import java.net.SocketTimeoutException;
import java.util.Random;

public class o15 {
    public static void main(String[] args) {
        // 10 elemanlı sayısal diziye
        // rastgele 0-100 arası değer ata
        // ekrana yazdır
        // eleman değeri tek olanları ekrana yazdır

        Random rnd = new Random();

        int[] sayilar = new int[10];
        for (int i = 0; i < sayilar.length; i++) {
            int sayi = rnd.nextInt(101);
            sayilar[i] = sayi;

            // sayilar[i] =rnd.nextInt(101);
        }
        System.out.println("Dizi Eleman Değerleri");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }
        // eleman değeri tek olanları ekrana yazdır
        System.out.println("Dizi Tek Eleman Değerleri");
        for (int i = 0; i < sayilar.length; i++) {
            int kalan = sayilar[i] % 2;
            if (kalan == 1)// sıradaki eleman tek
                System.out.println(sayilar[i]);
        }
        // eleman değeri tek olanları ekrana yazdır
        System.out.println("Dizi Tek Eleman Değerleri 2");
        for (int i = 0; i < sayilar.length; i++) 
            if ((sayilar[i] % 2) == 1)// sıradaki eleman tek
                System.out.println(sayilar[i]);
        
    }
}
