import java.util.Scanner;

import javax.swing.plaf.basic.BasicGraphicsUtils;

public class o21 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int baslangic,bitis;
        int kalan1,kalan2;

        System.out.println("Başlangıç: ");
        baslangic = giris.nextInt();

        System.out.println("Bitiş: ");
        bitis =giris.nextInt();

        do {
            kalan1 = baslangic % 8;
            kalan2 = baslangic % 5;
            if(kalan1==0 && kalan2!=0)
                System.out.println(baslangic);
            baslangic++;
        } while (baslangic<=bitis);
        
    }
}
