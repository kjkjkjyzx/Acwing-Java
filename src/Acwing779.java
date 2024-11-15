import java.util.Scanner;

public class Acwing779 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            char[][] matrix = new char[n][];
            int minLength = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                minLength = Math.min(minLength, s.length());
                StringBuilder str = new StringBuilder(s).reverse();
                matrix[i] = str.toString().toCharArray();
            }
            StringBuilder commonSuffix = new StringBuilder();
            for (int j = 0; j < minLength; j++) {
                boolean allSame = true;
                char c = matrix[0][j];
                for (int i = 1; i < n; i++) {
                    if (matrix[i][j]!= c) {
                        allSame = false;
                        break;
                    }
                }
                if (allSame) {
                    commonSuffix.append(c);
                } else {
                    break;
                }
            }
            if (commonSuffix.length() == 0) {
                System.out.println();
            } else {
                System.out.println(commonSuffix.reverse());
            }
        }
    }
}