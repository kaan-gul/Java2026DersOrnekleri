import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        sayiYazdir();
    }

    public static void sayiYazdir(){
        Scanner giris=new Scanner(System.in);
        int sayi1,sayi2,kalan;
        System.out.println("1.Sayı: ");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı: ");
        sayi2 = giris.nextInt();

        for (int i = sayi1; i <=sayi2; i++) {
            kalan = i % 5;
            if(kalan==0)
                System.out.println(i);
        }
    }
}
