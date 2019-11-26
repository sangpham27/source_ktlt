public class Day009 {
    /*Tính T(x, n) = x^n*/
    public static void main(String[] args){
        int T = 1;
        int i = 1;
        int x = 2;
        int n = 4;
        while (i <= n){
            T = T * x;
            i++;
        }
        System.out.println(T);
    }
}
