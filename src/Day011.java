public class Day011 {
    /*Tính S(n) = x + x^2 + x^3 + … + x^n*/
    public static void main(String[] args)
    {
        int x = 2;
        int i = 0;
        int s = 1;
        int n = 2;
        while (i <= n)
        {
            s = s + s*x;
            i++;
        }
        System.out.println(s);
    }
}
