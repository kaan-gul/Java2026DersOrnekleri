import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi;
        int toplam=0,adet=0;//gecici değişken toplam ve saymak için
                        //bu tür değişkenler hesaplamanın sonucunu etkileyemeyecek şekilde belirlenmeli
        do {
            System.out.println("Sayı: ");
            sayi = giris.nextInt();

            if(sayi>10){
                toplam+=sayi;
                ++adet;
            }
        } while (sayi>=0);
        System.out.println("Toplam= "+toplam);
        System.out.println("Adet= "+adet);


    }
}
