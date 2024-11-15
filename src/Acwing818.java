import java.util.Scanner;
public class Acwing818 {
    private static void sort(int a[], int l, int r) {
        for (int i = l; i <= r - 1; i++) {
            for (int j = i + 1; j <= r; j++) {
                if(a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int j : a) {//增强型for循环；
            System.out.printf(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sort(a, l, r);
    }
}
