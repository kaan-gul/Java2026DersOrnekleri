import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int carpan, adim, sonuc;

        System.out.println("Carpan= ");
        carpan = giris.nextInt();

        System.out.println("Adım= ");
        adim = giris.nextInt();

        for (int i = 1; i <= adim; i++) {
            sonuc = i * carpan;
            System.out.println(i + " x " + carpan + " = " + sonuc);
        }
    }
}
