import java.util.Random;

public class o4 {
    
    public static void main(String[] args) {
        int sayi = sayiTut();
        System.out.println(sayi);

        for (int i = 0; i < 10; i++) {
            System.out.println(sayiTut());
        }
    }
    public static int sayiTut(){
        Random rnd=new Random();
        int sayi;
        sayi = rnd.nextInt(101);//0-100 sayı tut

        return sayi;
    }
}
