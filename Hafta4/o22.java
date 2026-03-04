import java.util.Scanner;

public class o22 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int baslangic,bitis;
        int kalan1,kalan2;
        int siradakiSayi;

        System.out.println("Başlangıç: ");
        baslangic = giris.nextInt();

        System.out.println("Bitiş: ");
        bitis =giris.nextInt();
        
        siradakiSayi=baslangic;
        do {
            kalan1 = siradakiSayi % 8;
            kalan2 = siradakiSayi % 5;
            if(kalan1==0 && kalan2!=0)
                System.out.println(siradakiSayi);
            siradakiSayi++;
        } while (baslangic<=bitis);
    }
}
