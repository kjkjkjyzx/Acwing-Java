import java.util.Scanner;
public class Acwing742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int min = 1001;
        int p = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            if (x[i] < min) {
                min = x[i];
                p = i;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Position: " + p);
    }
}
