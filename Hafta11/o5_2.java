public class o5_2 {
    public static void main(String[] args) {
        try {
            int[] sayilar = { 10, 20, 30, 40, 50 };
            System.out.println(sayilar[0]);
            System.out.println(sayilar[4]);
            System.out.println(sayilar[5]);
            System.out.println("Kodlar çalıştı 1");
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("Hata oluştu");
        } finally {
            System.out.println("Program sonlanıyor...");
        }
    }
}
