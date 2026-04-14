public class o2 {
    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        int toplam;
        sayi1 = 10;
        sayi2 = 20;
        toplam = sayi1 + sayi2;
        System.out.println(toplam);
        System.out.println("********************");

        sayilariTopla(2,6);//s1=2,s2=6
        sayilariTopla(sayi1,sayi2);//s1=sayi1,s2=sayi2
    }

    public static void sayilariTopla(int s1, int s2) {
        int sonuc;
        sonuc = s1 + s2;
        System.out.println(sonuc);
    }
}
