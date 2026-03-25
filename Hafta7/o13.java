public class o13 {
    public static void main(String[] args) {
        int[][] notlar = { { 50, 60 }, { 60, 80 }, { 90, 80 }, { 80, 80 }, { 10, 60 }, { 50, 40 }, { 50, 30 },
                { 60, 90 }, { 100, 90 }, { 90, 100 } };

        //ortlama hesapla ekrana yazdır?
        //ort = vize*0.4 + final*0.6
        //1.vize  = notlar[0][0]
        //1.final = notlar[0][1]
        //2.vize  = notlar[1][0]
        //2.final = notlar[1][1]
        for (int i = 0; i < notlar.length; i++) {
            double ortalama;
            ortalama = notlar[i][0]*0.4+notlar[i][1]*0.6;
            System.out.println(ortalama);
        }
    }
}
