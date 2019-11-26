public class Day002 {
    public static void main(String[] args){
        /*Tính S(n) = 1^2 + 2^2 + … + n^2*/
        double s =0;
        int n = 4;
        int i =0;
        while (i < n){
            s = s + Math.pow(i,2);
            i++;
        }
        System.out.println(s);
    }
}
