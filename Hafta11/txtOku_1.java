import java.io.FileReader;

public class txtOku_1 {
    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\ogrenciler\\ogrenciler.txt";
            FileReader fr = new FileReader(dosyaAdi);
            int sonuc = fr.read();
            while (sonuc != -1) {
                System.out.print((char) sonuc);
                sonuc = fr.read();
            }
            fr.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
