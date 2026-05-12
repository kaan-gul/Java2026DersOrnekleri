import java.util.Random;

public class o23 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int sayi = rnd.nextInt(10);
        System.out.println(sayi);

        System.out.println("----------");
        for (int i = 0; i < 5; i++) {
            sayi = rnd.nextInt(41) + 10; // 10-50
            System.out.println(sayi);
        }
    }
}
