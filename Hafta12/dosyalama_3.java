import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class dosyalama_3 {

    public static List<String> stringList;

    public static void main(String[] args) {
        try {
            String dosyaAdi = "ogrenciNotlari.txt";
            Path filePath = new File(dosyaAdi).toPath();
            stringList = Files.readAllLines(filePath, Charset.defaultCharset());
            verileriOku_V1();
            
        } catch (IOException iOException) {
            System.out.println("Hata Oluştu");
        }
    }

    public static void verileriOku_V1(){

        // 1882842196;Erdem;RAMAZAN;4;2.53;52;2.53;88
        for (String satir : stringList) {
            String[] bilgiler = satir.split(";");
            int sinif = Integer.parseInt(bilgiler[3]);
            if (sinif < 3) {// Integer.parseInt(bilgiler[3])<3
                System.out.println(bilgiler[1] + " " + bilgiler[2]);
            }
        }

    }
}
