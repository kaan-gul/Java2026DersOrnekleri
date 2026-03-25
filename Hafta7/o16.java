import java.util.Arrays;

public class o16 {
    public static void main(String[] args) {
        int[] sayilar = {5,3,1,7,9};
        System.out.println(Arrays.toString(sayilar));
        //DİKKAT DİKKAT DİKKAT
        int[] sayilar2 = sayilar;
        System.out.println(Arrays.toString(sayilar));
        sayilar[0] = 100;
        System.out.println("******************");
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(sayilar2));
    }
}
