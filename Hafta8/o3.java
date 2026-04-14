public class o3 {
    public static void main(String[] args) {
        int toplam;
        toplam = topla(5, 30);
        System.out.println(toplam);
        System.out.println("************");
        System.out.println(topla(20, 650));
        System.out.println("************");

        int deger;
        deger = 50 * 20 + topla(56, 87);
        System.out.println(deger);
    }

    public static int topla(int sayi1, int sayi2) {
        int toplam;
        toplam = sayi1 + sayi2;
        return toplam;
    }
}
