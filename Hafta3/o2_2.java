import java.util.Scanner;

public class o2_2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi,kalan;

        System.out.println("Sayıyı Gir:");
        sayi = giris.nextInt();

        kalan = sayi % 2;//kalan bulundu

        if(kalan==0){
            System.out.println("Çift sayıdır");
        }else{
            System.out.println("Tek sayıdır.");
        }
    }
}
