public class Day003 {
    public static void main(String[] args){
        /*Tính S(n) = 1 + ½ + 1/3 + … + 1/n*/
        double s = 0;
        int i = 1;
        int n = 4;
        while (i < n) {
            s = s + 1/i;
            i++;
        }
        System.out.println(s);
    }
}
