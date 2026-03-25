import java.util.Random;
import java.util.Scanner;

public class o12 {
    public static void main(String[] args) {
        //DİNAMİK DİZİ
        Random rnd=new Random();
        Scanner giris=new Scanner(System.in);
        int elemanSayisi=0;
        int[] sayilar;
        

        System.out.println("Kaç Adet Sayı tutulsun:");
        elemanSayisi =giris.nextInt();

        sayilar = new int[elemanSayisi];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(100);//0-99
        }
        System.out.println("*************");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]); 
        }


    }
}
