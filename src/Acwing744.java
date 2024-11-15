import java.util.Scanner;
public class Acwing744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[12][12];
        int c = sc.nextInt();
        char a = sc.next().charAt(0);
        double sum = 0;
        for (int i = 0; i < m.length; i++) {//length为数组的API，而字符串的关于求长度的API为length();
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextDouble();
                if(c == j){
                    sum += m[i][j];
                }
            }
        }
        if(a == 'S')
            System.out.printf("%.1f", sum);
        else
            System.out.printf("%.1f", sum / 12);
    }
}
