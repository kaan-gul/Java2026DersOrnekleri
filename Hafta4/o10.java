import java.util.Scanner;

public class o10 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int ogrNot;

        System.out.println("Öğrenci Notu Gir:");
        ogrNot = giris.nextInt();

        if (0 <= ogrNot && ogrNot < 25)
            System.out.println("F");
        else if(25<=ogrNot && ogrNot<45)
            System.out.println("E");
        else if(45<=ogrNot && ogrNot<55)
            System.out.println("D");
        else if(55<=ogrNot && ogrNot<70)
            System.out.println("C");
        else if(70<=ogrNot && ogrNot<85)
            System.out.println("B");
        else if(85<=ogrNot && ogrNot<=100)
            System.out.println("A");


        giris.close();
    }
}
