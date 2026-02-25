import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi,kalan;

        System.out.println("Sayıyı Gir:");
        sayi = giris.nextInt();

        kalan = sayi % 2;//kalan bulundu

        if(kalan==0){
            System.out.println("Çift sayıdır");
        }

        if(kalan==1){
            System.out.println("Tek sayıdır.");
        }
    }
}
