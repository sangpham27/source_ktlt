public class Day007 {
    /*Tính S(n) = ½ + ¾ + 5/6 + … + 2n + 1/ 2n + 2*/
    public static void main(String[] args){
        double s = 0;
        double i = 0;
        double n = 4.0;
        while (i< n){
            s = s + (2*i +1)/(2*i + 2);
            i++;
        }
        System.out.println(s);
    }
}
