public class metotDizi_2 {
    public static void main(String[] args) {
        int[] sayilar = { 2, 3, 5, 6, 9 };

        int sonuc = elemanToplami(sayilar);
        System.out.println(sonuc);
    }

    // kendisine yollanan sayısal dizinin
    // elemanlarının toplamını bulup
    // geriye dönrdüren metot
    public static int elemanToplami(int[] gelenDizi) {
        int toplam = 0;
        for (int siradakiEleman : gelenDizi) {
            toplam += siradakiEleman;
        }
        return toplam;
    }
}
