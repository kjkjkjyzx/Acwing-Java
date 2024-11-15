import java.util.Scanner;
public class Acwing84 {
    public int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Acwing84 a = new Acwing84();
        System.out.println(a.getSum(n));
    }
}
