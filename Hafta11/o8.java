import java.io.File;

public class o8 {
    public static void main(String[] args) {
        File file = new File("d:\\ogrenciler\\a");
        if (!file.exists())
            file.mkdir();

    }
}
