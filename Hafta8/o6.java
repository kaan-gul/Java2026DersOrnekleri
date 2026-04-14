public class o6 {
    public static void main(String[] args) {
        topla(1);//int[] sayilar = {1}
        topla(2,6,9);//int[] sayilar = {2,6,9}
        topla(3,5,7,9,100);//int[] sayilar = {3,5,7,9,100}
    }
    //değişken sayıda parametre alan metot
    public static void topla(int ... sayilar){
        int toplam =0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        System.out.println(toplam);
    }
}
