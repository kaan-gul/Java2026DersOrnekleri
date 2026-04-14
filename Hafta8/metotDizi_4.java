public class metotDizi_4 {
    public static void main(String[] args) {
        int[] sayilar = { 2, 3, 6, 5, 3, 9, 8 };

    }

    public static void tekleriGetir(int[] gelenDizi) {
        int[] tekler;
        int adet = 0;
        int kalan = 0;
        //geriye döndürülecek dizinin
        //eleman sayısını bulabilmek için
        for (int siradakiEleman : gelenDizi) {
            kalan = siradakiEleman % 2;
            if (kalan == 1)
                adet++;
        }
        //tekler dizisine sırayla tek elemanları ata
        tekler = new int[adet];
        int yeniIndex=0;
        for (int i = 0; i < gelenDizi.length; i++) {
            int siradakiEleman = gelenDizi[i];
            kalan = siradakiEleman % 2;
            if (kalan == 1){
                tekler[yeniIndex] = siradakiEleman;
                yeniIndex++;
            }
        }
    }
}
