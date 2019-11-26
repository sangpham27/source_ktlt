public class Day010 {
    /*Tính S(n) = 1 + 1.2 + 1.2.3 + … + 1.2.3….N*/
    public static void main(String[] args){
        int s = 1;
        int i = 0;
        int n = 4;
        while (i <= n){
            s = s + s*i;
            i++;
        }
        System.out.println(s);
    }
}
