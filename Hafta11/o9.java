import java.io.File;

public class o9 {
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            String yol="d:\\ogrenciler\\a\\NewFolder "+i;
            File file = new File(yol);
            if (!file.exists())
                file.mkdir();
        }

    }
}
