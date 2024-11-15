import java.util.Scanner;
public class Acwing756 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[][] arr = new int[n][m];
                int top = 0;
                int bottom = n - 1;
                int left = 0;
                int right = m - 1;
                int k = 1;

                while (top <= bottom && left <= right) {
                    // 从左到右填充顶部一行
                    for (int j = left; j <= right; j++) {
                        arr[top][j] = k++;
                    }
                    top++;
                    // 从上到下填充最右列
                    for (int i = top; i <= bottom; i++) {
                        arr[i][right] = k++;
                    }
                    right--;
                    // 从右到左填充底部一行（需要判断是否越界）
                    if (top <= bottom) {
                        for (int j = right; j >= left; j--) {
                            arr[bottom][j] = k++;
                        }
                        bottom--;
                    }
                    // 从下到上填充最左列（需要判断是否越界）
                    if (left <= right) {
                        for (int i = bottom; i >= top; i--) {
                            arr[i][left] = k++;
                        }
                        left++;
                    }
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
    }
}

