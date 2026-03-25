import java.util.Arrays;

public class o18 {
    public static void main(String[] args) {
        int[] sayilar = { 5, 3, 1, 7, 9 };
        System.out.println(Arrays.toString(sayilar));

        Arrays.sort(sayilar);
        int index = Arrays.binarySearch(sayilar, 3);
        System.out.println(index);
        System.out.println(Arrays.toString(sayilar));
        index = Arrays.binarySearch(sayilar, 100);
        System.out.println(index);
    }
}
