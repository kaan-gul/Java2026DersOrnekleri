import java.util.Arrays;

public class metot1 {
    public static void main(String[] args) {
        int[] sayilar = { 2, 3, 6, 5, 3, 9, 8,11 };

        int[] sonuc= tekleriGetir(sayilar);

        System.out.println(Arrays.toString(sonuc));



        //int[] dizi1=new int[5];
        //int[] dizi2=new int[10];

        //dizi1=dizi2; //burada dizi2 ve dizi1 aynı dizi oldu. RAM da aynı yeri gösteriyorlar
    }

    public static int[] tekleriGetir(int[] gelenDizi) {
        int[] tekler;
        int adet = 0;
        int kalan = 0;
        // geriye döndürülecek dizinin
        // eleman sayısını bulabilmek için
        for (int siradakiEleman : gelenDizi) {
            kalan = siradakiEleman % 2;
            if (kalan == 1)
                adet++;
        }
        // tekler dizisine sırayla tek elemanları ata
        tekler = new int[adet];
        int yeniIndex = 0;
        for (int i = 0; i < gelenDizi.length; i++) {
            int siradakiEleman = gelenDizi[i];
            kalan = siradakiEleman % 2;
            if (kalan == 1) {
                tekler[yeniIndex] = siradakiEleman;
                yeniIndex++;
            }
        }

        return tekler;
    }
}
