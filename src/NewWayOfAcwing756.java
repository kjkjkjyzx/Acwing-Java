import java.util.Scanner;
public class NewWayOfAcwing756 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int left = 0;//左边界；
        int right = m - 1;//右边界；
        int top = 0;//上边界；
        int bottom = n - 1;//下边界；
        int[][] a = new int[n][m];//n*m 的二维数组；
        int b = 1;
        while (left <= right && top <= bottom) {//每环绕一圈，左边界都会右移，右边界左移，上边界下移，下边界上移；
            for(int j = left; j <= right; j++) {//当上下和左右边界分别重合时，循环停止；
                a[top][j] = b;
                b ++;
            }
            for(int i = top + 1; i <= bottom; i++) {
                a[i][right] = b;
                b ++;
            }
            for(int j = right - 1; j >= left; j--) {
                a[bottom][j] = b;
                b ++;
            }
            for(int i = bottom - 1; i >= top + 1; i--) {
                a[i][left] = b;
                b ++;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
