public class Day001 {
    public static  void main(String[] args){
    /*Tinh S(n) = 1 + 2 + 3 + ... + n  */
            int s=0;
          int n =4;
          int i =0;
          while (i <= n){
              s = s+ i;
              i++;
          }
          System.out.println(s);
    }
}
