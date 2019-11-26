public class Day008 {
    /*Tính T(n) = 1 x 2 x 3…x N*/
    public static void main(String[] args){
        int T = 1;
        int i = 1;
        int n = 4;
        while (i < 4) {
            T = T * i;
            i++;
        }
        System.out.println(T);
    }
}
