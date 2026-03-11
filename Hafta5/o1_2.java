import java.util.Random;
import java.util.Scanner;

public class o1_2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        Random rnd=new Random();

        int tahmin,tutulanSayi;

        tutulanSayi = rnd.nextInt(101);//0-100
        System.out.println("Bir sayı tuttum, haydi bil bakalım:)");

        do {
            System.out.println("Tahmin: ");
            tahmin = giris.nextInt();
            if(tutulanSayi>tahmin)
                System.out.println("Yukarı");
            else if(tutulanSayi<tahmin)
                System.out.println("Aşağı");
            else
                System.out.println("Tebrikler");
        } while (tutulanSayi!=tahmin);

    }
}
