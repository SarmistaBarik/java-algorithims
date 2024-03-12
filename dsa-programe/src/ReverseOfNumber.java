import java.util.Scanner;

public class ReverseOfNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = reverseBinary(n);
        System.out.println(result);



    }

    private static int reverseBinary(int n) {
        int f = 31;
        int l = 0;
        int rev = 0;
        while(f > l) {
            if ((n & (1 << f)) != 0) {
                rev = rev | (1 << l);
            }
            if ((n & (1 << l)) != 0) {
                rev = rev | (1 << f);
            }
            f--;
            l++;
        }
        return rev;
    }


}
