public class metot2 {
    public static void main(String[] args) {
        String bulunanKelime;
        bulunanKelime = kelimeyiGetir_V2("Bugün hava çok güzel", 5);
        System.out.println(bulunanKelime);
    }

    public static String kelimeyiGetir(String cumle, int kelimeSiraNo) {
        String kelime = "";
        String[] kelimeler = cumle.split(" ");
        kelime = kelimeler[kelimeSiraNo - 1];
        return kelime;
    }

    public static String kelimeyiGetir_V2(String cumle, int kelimeSiraNo) {
        String kelime = "";
        try {

            String[] kelimeler = cumle.split(" ");
            kelime = kelimeler[kelimeSiraNo - 1];

        } catch (Exception e) {
            kelime = "";
            System.out.println("Bir hata oldu falan...");
        }
        return kelime;
    }

    public static String kelimeyiGetir_V3(String cumle, int kelimeSiraNo) {
        String kelime = "";
        String[] kelimeler = cumle.split(" ");
        if (kelimeSiraNo <= kelimeler.length)
            kelime = kelimeler[kelimeSiraNo - 1];
        else
            System.out.println("Bir hata oldu falan...");
        return kelime;
    }
}
