import java.util.Scanner;
public class Acwing750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[12][12];
        char a = sc.next().charAt(0);
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextDouble();
                if (i > j && i + j > 11) {
                    sum += m[i][j];
                }
            }
        }
        if (a == 'S')
            System.out.printf("%.1f", sum);
        else
            System.out.printf("%.1f", sum / 30);
    }
}
