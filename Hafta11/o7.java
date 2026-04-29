import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class o7 {
    public static void main(String[] args) {
        List<Integer> liste1 = new ArrayList<Integer>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int sayi = rnd.nextInt(100);
            liste1.add(sayi);
        }
        System.out.println("-------");
        for(int i=0;i<liste1.size();i++)
            System.out.println(liste1.get(i));

        System.out.println("--------");
        liste1.remove(2);//index 2 olanı sil
        liste1.add(5,100);//araya eleman ekleme
        System.out.println("-------");
        for(int i=0;i<liste1.size();i++)
            System.out.println(liste1.get(i));

        liste1.clear();//liste silinir

        liste1.set(5, 500);//index 5 olanı 500 yap

    }
}
