public class o14 {
    public static void main(String[] args) {
        int kalan = 0;
        for (int sayi = 0; sayi < 100; sayi++) {
            //int kalan = 0;
            kalan = sayi % 2;
            if (kalan == 1)// tek
                System.out.println(sayi);
        }
    }
}
