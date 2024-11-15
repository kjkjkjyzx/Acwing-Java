import java.util.Scanner;
public class Acwing812 {
    private static  void print(int a[], int size){
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        print(a, size);
    }
}
