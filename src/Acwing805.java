import java.util.Scanner;
public class Acwing805 {
    private static int max(int x, int y) {
        if (x > y)
            return x;
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = max(x, y);
        System.out.println(max);
    }
}
