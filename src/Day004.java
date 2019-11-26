public class Day004 {
    /*Tính S(n) = ½ + ¼ + … + 1/2n*/
    public static void main(String[] args) {
        double s =0;
        int i =1;
        int n = 4;
        while (i < n)
        {
            s = s + 1%(2*i);
            i++;
        }
        System.out.println(s);
    }

}
