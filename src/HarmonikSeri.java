public class HarmonikSeri {
    public static void main(String[] args) {
        double result=0.0;
        int [] dizi={4,7,2,8,12,3};
        for(int i:dizi){
            result+=1.0/i;
        }

        System.out.println(dizi.length/result);
    }
}
