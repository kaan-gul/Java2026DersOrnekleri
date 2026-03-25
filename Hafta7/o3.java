public class o3 {
    public static void main(String[] args) {
        
        int notlar[][]=new int[3][2];
        //1.öğrenci vize
        notlar[0][0] = 50;
        //1.öğrenci final
        notlar[0][1] = 60;
        
        //2.öğrenci notları
        notlar[1][0] = 40;
        notlar[1][1] = 50;

        //3.öğrenci notları
        notlar[2][0] = 30;
        notlar[2][1] = 30;

        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[0].length; j++) {
                System.out.println(notlar[i][j]);
            }
        }
        System.out.println("*****************");
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[0].length; j++) {
                if(j==0)
                    System.out.println("Vize: "+notlar[i][j]);
                else
                    System.out.println("Final: "+notlar[i][j]);
            }
        }
        System.out.println("*****************");
        for (int i = 0; i < notlar.length; i++) {
            System.out.println("Vize: "+notlar[i][0]);
            System.out.println("Final: "+notlar[i][1]);
        }
        System.out.println("*****************");
        for (int i = 0; i < notlar.length; i++) {
            System.out.println((i+1) +". Öğrenci Vize: "+notlar[i][0]);
            System.out.println((i+1) +". Öğrenci Final: "+notlar[i][1]);
        }
    }
}
