import java.lang.reflect.Array;
import java.util.Arrays;

public class o20 {
    public static void main(String[] args) {
        int[] sayilar = { 5, 3, 1, 7, 9 };
        int[] sayilar2 = Arrays.copyOf(sayilar, 2);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(sayilar2));
        System.out.println("*******************");

        int[] sayilar3 = Arrays.copyOfRange(sayilar, 2,4);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(sayilar3));
    }
}
