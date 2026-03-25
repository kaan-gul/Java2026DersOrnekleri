import java.util.Arrays;

public class o19 {
    public static void main(String[] args) {
        int[] sayilar = { 5, 3, 1, 7, 9 };
        int[] sayilar2 = { 5, 3, 1, 7, 9 };

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(sayilar2));

        boolean sonuc=Arrays.equals(sayilar, sayilar2);
        System.out.println(sonuc);
    }
}
