import java.util.Scanner;
public class Acwing755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while((n = sc.nextInt()) != 0) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    System.out.printf("%.0f ", Math.pow(2, (double)(i + j - 2)));
                }//Math.pow(a,b):求幂函数，a为底数，b为指数；
                System.out.println();
            }
            System.out.println();
        }
    }
}
