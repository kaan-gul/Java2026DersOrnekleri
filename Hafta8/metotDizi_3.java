import java.util.Arrays;

public class metotDizi_3 {
    public static void main(String[] args) {
        int[] sayilar = {3,5,7,9};
        int[] sayilar2 = diziKopyala(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(sayilar2));
    }

    // kendisine yollanan sayısal dizinin
    // kopyasını oluşturup
    // geriye döndüren metot
    public static int[] diziKopyala(int[] gelenDizi) {
        int[] kopyaDizi;
        kopyaDizi = gelenDizi.clone();

        return kopyaDizi;
    }

}
