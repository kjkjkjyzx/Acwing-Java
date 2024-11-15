import java.util.Scanner;
public class Acwing753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while((n = sc.nextInt()) != 0){

            int left = 1, top = 1;
            int right = n,bottom = n;
            int k = 1;
            int[][] arr = new int[n+1][n+1];

            while (left <= right && top <= bottom) {
                // 填充上边
                for (int i = left; i <= right; i++) {
                    arr[top][i] = k;
                }
                top++;
                // 填充右边
                for (int i = top; i <= bottom; i++) {
                    arr[i][right] = k;
                }
                right--;
                // 填充下边
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        arr[bottom][i] = k;
                    }
                    bottom--;
                }
                // 填充左边
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        arr[i][left] = k;
                    }
                    left++;
                }
                k++;
            }
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}