import java.util.Scanner;

public class o7 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1, sayi2, sonuc=0;
        String islem;

        System.out.print("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.print("2.Sayı:");
        sayi2 = giris.nextInt();
        
        giris.nextLine();

        System.out.print("İşlem(+,-,*,/): ");
        islem = giris.nextLine();

        switch (islem) {
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            case "/":
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Hatalı veri girişi yapıldı");
                break;
        }
        System.out.println("Sonuc= " + sonuc);
    }
}
