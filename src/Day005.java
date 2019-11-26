public class Day005 {
    /*Tính S(n) = 1/1×2 + 1/2×3 +…+ 1/n x (n + 1)*/
    public static void main(String[] args){
        double s = 0;
        double i = 1.0 ;
        double n = 4.0;
        while (i < n) {
            s = s + 1/(i * (i+1));
            i++;
        }
        System.out.println(s);
    }
}
