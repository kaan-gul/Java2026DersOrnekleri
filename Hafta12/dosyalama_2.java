import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class dosyalama_2 {
    public static void main(String[] args) {
        try {
            String dosyaAdi = "ogrenciNotlari.txt";
            Path filePath = new File(dosyaAdi).toPath();
            List<String> stringList = Files.readAllLines(filePath, Charset.defaultCharset());
            verileriOku_V1(stringList);
            
        } catch (IOException iOException) {
            System.out.println("Hata Oluştu");
        }

    }

    public static void verileriOku_V1(List<String> gelenBilgiler) {

        // 1882842196;Erdem;RAMAZAN;4;2.53;52;2.53;88
        for (String satir : gelenBilgiler) {
            String[] bilgiler = satir.split(";");
            int sinif = Integer.parseInt(bilgiler[3]);
            // bilgiler[0] = ogrno
            // bilgiler[1] = ad
            // bilgiler[2] = soyad
            // bilgiler[3] = sınıf
            // bilgiler[4] = ort
            // bilgiler[5] = vize
            // bilgiler[6] = ort
            // bilgiler[7] = final
            if (sinif < 3) {// Integer.parseInt(bilgiler[3])<3
                System.out.println(bilgiler[1] + " " + bilgiler[2]);
            }
        }

    }
}
