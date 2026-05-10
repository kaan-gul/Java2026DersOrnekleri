import java.util.Scanner;

public class menuOlusturma_2 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int secim = 0;
        String[][] ogrenciler = new String[50][5];

        do {
            System.out.println("[1] Bilgi Gir");
            System.out.println("[2] Öğrenci Listele");
            System.out.println("[3] Çıkış");
            System.out.print("Seçim Yapınız:");
            secim = giris.nextInt();
            // giris.nextLine();

            switch (secim) {
                case 1:
                    altMenu1();
                    break;
                case 2:
                    altMenu2();
                    break;
            }            

        } while (secim != 3);

    }

    public static void altMenu1() {
        System.out.println("====Bilgi Gir====");
        System.out.println("Ad:");
        System.out.println("Soyad:");
        System.out.println("Sınıf:");
        System.out.println("Cinsiyet:");
        System.out.println("Numara:");
    }

    public static void altMenu2() {
        Scanner giris = new Scanner(System.in);
        int secim2 = 0;
        System.out.println("====Listele====");
        System.out.println("[1] A göre listele");
        System.out.println("[2] B göre listele");
        System.out.println("[3] C göre listele");
        System.out.println("[4] D göre listele");
        System.out.println("[5] üst menüne dön");
        System.out.print("Secim:");
        secim2 = giris.nextInt();
        if (secim2 == 1) {
            // dizide arama tarama işlemini yap A
        }
    }
}
