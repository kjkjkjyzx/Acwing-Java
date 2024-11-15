import java.util.Scanner;
public class Acwing741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        double[] Fib = new double[70];
        Fib[0] = 0;
        Fib[1] = 1;
        for(int i = 2; i < Fib.length; i++){
            Fib[i] = Fib[i - 1] + Fib[i - 2];
        }
        while (t > 0) {
            t --;
            n = sc.nextInt();
            System.out.printf("Fib(%d) = %.0f\n", n,Fib[n]);
        }
    }
}
