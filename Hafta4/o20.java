import java.util.Scanner;

public class o20 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int baslangic,bitis;
        int kalan1,kalan2;

        System.out.println("Başlangıç: ");
        baslangic = giris.nextInt();

        System.out.println("Bitiş: ");
        bitis =giris.nextInt();

        for (int i = baslangic; i <= bitis; i++) {
            kalan1 = i % 8;
            kalan2 = i % 5;
            if(kalan1==0 && kalan2!=0)
                System.out.println(i);
        }
    }
}
