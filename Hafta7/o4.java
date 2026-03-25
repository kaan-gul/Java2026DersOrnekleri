import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int notlar[][]=new int[3][2];

        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Vize Gir:");
            notlar[i][0] = giris.nextInt();

            System.out.print("Final Gir:");
            notlar[i][1] = giris.nextInt();
        }
        System.out.println("*****************");
        for (int i = 0; i < notlar.length; i++) {
            System.out.println((i+1) +". Öğrenci Vize: "+notlar[i][0]);
            System.out.println((i+1) +". Öğrenci Final: "+notlar[i][1]);
        }
    }
}
