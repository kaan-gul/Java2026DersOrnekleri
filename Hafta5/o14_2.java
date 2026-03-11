import java.util.Scanner;

public class o14_2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int[] sayilar =new int[5];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Eleman Değeri= ");
            sayilar[i] = giris.nextInt();
        }
        System.out.println("****TEST*****");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }
        System.out.println("****TEST*****");
        //for (int i = 4; i >=0; i--) {
        for (int i = sayilar.length-1; i >=0; i--) {
            System.out.println(sayilar[i]);
        }
    }
}
