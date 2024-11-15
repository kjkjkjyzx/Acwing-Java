import java.util.Scanner;
public class NewWayOfAcwing753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建一个 Scanner 对象的，用于从标准输入（通常是键盘）获取用户的输入
        int n;
        while(true){
            n = sc.nextInt();
            if(n <= 0)
                break;
            int[][] matrix = new int[n+1][n+1];
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    int c = Math.min(i - 1,n - i);//matrix[i][j]到上下边界的距离；
                    int d = Math.min(j - 1,n - j);//matrix[i][j]到左右边界的距离；
                    matrix[i][j] = Math.min(c,d) + 1;//第一圈与边界的距离为0，第二圈为1，第三圈为2；
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
