import java.util.Scanner;

public class o9 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int ogrNot;

        System.out.println("Öğrenci Notu Gir:");
        ogrNot = giris.nextInt();

        if (0 <= ogrNot && ogrNot < 25)
            System.out.println("F");
        if(25<=ogrNot && ogrNot<45)
            System.out.println("E");
        if(45<=ogrNot && ogrNot<55)
            System.out.println("D");
        if(55<=ogrNot && ogrNot<70)
            System.out.println("C");
        if(70<=ogrNot && ogrNot<85)
            System.out.println("B");
        if(85<=ogrNot && ogrNot<=100)
            System.out.println("A");


        giris.close();
    }
}
