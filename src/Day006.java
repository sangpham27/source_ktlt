public class Day006 {
    /*Tính S(n) = ½ + 2/3 + ¾ + …. + n / n + 1*/
    public static void main(String[] args) {
        double s = 0;
        double i = 0;
        double n = 4;
        while (i < n) {
            s = s + i / (i+1);
            i++;
        }
        System.out.println(s);
    }
}
