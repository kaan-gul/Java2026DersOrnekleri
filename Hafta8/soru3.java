public class soru3 {
    public static void main(String[] args) {
        int sonuc = hesapMakinesi(10, 20, '+');
        System.out.println(sonuc);
    }

    public static int hesapMakinesi(int sayi1, int sayi2, char islem) {
        int sonuc=0;
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;            
        }
        
        return sonuc;
    }
}
