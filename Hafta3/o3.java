import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double sinav1,sinav2,ortalama;

        System.out.println("1.Sınav Gir:");
        sinav1 = giris.nextDouble();

        System.out.println("2.Sınavı Gir:");
        sinav2 = giris.nextDouble();

        ortalama = (sinav1+sinav2)/2;

        System.out.println("Ortalama="+ortalama);

        if(ortalama>=70)
            System.out.println("Başarılı");
    }
}
