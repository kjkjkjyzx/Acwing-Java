import java.util.Arrays;
import java.util.Scanner;
public class Acwing814 {
    private static void copy(int[] a, int[] b, int size){
        if (size >= 0) System.arraycopy(a, 0, b, 0, size);
        for (int j : b) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int size = sc.nextInt();
        int[] a= new int[n];
        int[] b= new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        copy(a,b,size);
    }
}
