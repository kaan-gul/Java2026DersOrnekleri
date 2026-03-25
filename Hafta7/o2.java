public class o2 {
    public static void main(String[] args) {
        int[ ] [ ] cokBoyutlu1 = new int[2][3];
        //satır da ilerlemek
        for (int i = 0; i < cokBoyutlu1.length; i++) {
            //sutunda ilerlemek için
            for (int j = 0; j < cokBoyutlu1[0].length; j++) {
            System.out.println(cokBoyutlu1[i][j]);
          }  
        }
        System.out.println("******************");
        //satır da ilerlemek
        for (int i = 0; i < cokBoyutlu1.length; i++) {
            //sutunda ilerlemek için
            for (int j = 0; j < cokBoyutlu1[i].length; j++) {
            System.out.println(cokBoyutlu1[i][j]);
          }  
        }
        System.out.println("******************");
        //satır da ilerlemek
        for (int i = 0; i < cokBoyutlu1.length; i++) {
            //sutunda ilerlemek için
            for (int j = 0; j < cokBoyutlu1[i].length; j++) {
            System.out.print(cokBoyutlu1[i][j]+"\t");
          }  
          System.out.println();
        }
    }
}
