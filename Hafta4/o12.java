public class o12 {
    public static void main(String[] args) {
        int sayi = 0;
        int kalan = 0;

        do {
            kalan = sayi % 2;
            if (kalan == 1)// tek
                System.out.println(sayi);

            sayi++;
        } while (sayi < 100);
        //çıkış
    }
}
