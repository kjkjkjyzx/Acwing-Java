import java.util.Scanner;
public class Acwing754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while((n = sc.nextInt()) != 0) {
            int[][] arr = new int[n][n];
            for(int i = 0; i <= n - 1; i++) {
                for(int j = 0; j <= n - 1; j++) {
                    arr[i][j] = Math.abs(i - j) + 1;//Math.abs():求绝对值函数；
                }
            }
            for(int i = 0; i <= n - 1; i++) {
                for(int j = 0; j <= n - 1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
