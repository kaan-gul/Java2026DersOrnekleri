import java.util.Scanner;

public class o19 {
    public static void main(String[] args) {
        //0 dan klavyeden girilen değere kadar 
        // aradaki sayılardan 7 nin katlarını 
        // ekrana yazdıran programı yazınız.

        Scanner giris=new Scanner(System.in);
        int sayi = 0;//baslangic değeri
        int bitis;
        int kalan;
        System.out.println("Bitiş: ");
        bitis = giris.nextInt();

        do {
            kalan = sayi % 7;
            if(kalan==0)
                System.out.println(sayi);
            sayi++;
        } while (sayi<=bitis);//başlangıç ve bitis dahil oldu


    }
}
