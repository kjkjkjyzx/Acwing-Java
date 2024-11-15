import java.util.Scanner;
public class Acwing809 {
    private static int lcm(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int k = 1;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                k = i;
            }
        }
        int lcm = a * b / k;
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b));
    }
}
