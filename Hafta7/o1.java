public class o1 {
    public static void main(String[] args) {
        int[ ] [ ] cokBoyutlu1 = new int[2][3];

        System.out.println(cokBoyutlu1[0][0]);
        System.out.println(cokBoyutlu1[0][1]);
        System.out.println(cokBoyutlu1[0][2]);
        //Alttaki satır çalışma zamanı hatası verir
        //çünkü indeks 3 olan sutun yok
        //System.out.println(cokBoyutlu1[0][3]);

        System.out.println("satır sayısı: "+ cokBoyutlu1.length);
        System.out.println("satırın eleman sayısı (sutun sayısı): "+cokBoyutlu1[0].length);

    }
}
