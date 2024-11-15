import java.util.Scanner;
public class Acwing822 {
    private static int walk(int n, int m) {//定义一个方法；
        int step = m + n;
        int walk = 1;
        for (int i = 1; i <= m; i++) {
            walk = walk * step / i;
            step --;
        }
        return walk;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int walk = walk(n, m);
        System.out.println(walk);
    }
}
