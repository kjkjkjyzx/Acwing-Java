import java.util.Scanner;
public class Acwing806 {
    private static double add(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.printf("%.2f",add(x, y));
    }
}
