public class o13 {
    public static void main(String[] args) {
        int sayi = 0;
        int kalan = 0;

         while (sayi < 100) {
            kalan = sayi % 2;
            if (kalan == 1)// tek
                System.out.println(sayi);

            //sayi++;
            ++sayi;
        }
        //çıkış
    }
}
