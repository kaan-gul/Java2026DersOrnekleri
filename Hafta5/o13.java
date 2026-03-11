import java.util.Scanner;

public class o13 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int[] sayilar1 = new int[3];
        sayilar1[0] = 5;
        sayilar1[1] = 6;
        sayilar1[2] = 8;
        System.out.println("***********");
        System.out.println(sayilar1[0]);
        System.out.println(sayilar1[1]);
        System.out.println(sayilar1[2]);
        System.out.println("***********");
        for (int i = 0; i < 3; i++) {
            System.out.println(sayilar1[i]);
        }
        System.out.println("***********");
        for (int i = 0; i < sayilar1.length; i++) {
            System.out.println(sayilar1[i]);
        }


    }
}
