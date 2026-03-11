import java.util.Scanner;

public class o5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi1, sayi2, toplam;
        String secim;

        do {
            System.out.println("1.Sayı: ");
            sayi1 = giris.nextInt();

            System.out.println("2.Sayı: ");
            sayi2 = giris.nextInt();

            toplam = sayi1 + sayi2;

            System.out.println("Toplam= " + toplam);
            
            giris.nextLine();
            System.out.println("Tekrar hesaplama yapmak istiyormusun (e/h): ");
            secim = giris.nextLine();
        } while (secim.equals("e"));
    }
}
