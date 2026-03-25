import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        for (int i = 0, j = 0, k = 10; i < 10; i++, k++) {
            System.out.println(k);
        }

        Scanner giris = new Scanner(System.in);
        for (int i = 0, j = 0, k = 10; i < 10 && 1 < 2; i++, k++, System.out.print("Sayı Gir:"), k = giris.nextInt()) {
            System.out.println(k);
        }
    }
}
