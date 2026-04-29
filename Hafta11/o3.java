public class o3 {
    public static void main(String[] args) {
        try {
            int[] sayilar = { 10, 20, 30, 40, 50 };
            System.out.println(sayilar[0]);
            System.out.println(sayilar[4]);
            System.out.println(sayilar[5]);
            System.out.println("Kodlar çalıştı 1");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Hata oluştu");
        }
        System.out.println("Kodlar çalıştı 2");

    }
}
