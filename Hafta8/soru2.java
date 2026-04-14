public class soru2 {
    public static void main(String[] args) {
        asalSayiListele(10,20);
    }

    public static void asalSayiListele(int sayi1,int sayi2){
        for (int i = sayi1; i <= sayi2; i++) {
            //sıradaki sayı asal sayımı
            //sıradaki sayı hangi değişkende i
            int bolenAdeti=0;
            int kalan=0;
            for (int j = 1; j <=i; j++) {
                kalan = i % j;
                if(kalan==0)
                    bolenAdeti++;
            }
            if (bolenAdeti==2)
                System.out.println(i);
        }
    }
}
