public class o7 {
    public static void main(String[] args) {
        double nufus=77;
        double artisMiktari;
        for(int i=0;i<10;i++){
            artisMiktari= (nufus/100)*1.3;
            nufus=nufus+artisMiktari;
            //nufus+=artisMiktari;
            System.out.println((i+1) +".Yıl Sonu Nufus= "+nufus);
        }
    }
}
