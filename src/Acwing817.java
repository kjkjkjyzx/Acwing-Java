import java.util.Scanner;
public class Acwing817 {
    private static int get_unique_count(int[] a, int n){
        for(int i = 0; i < n - 1; i ++){
            for(int j = i + 1;j < n;j ++){
                if(a[i] == a[j]){
                    a[j] = 0;
                }
            }
        }
        int g = 0;
        for(int i = 0; i < n; i ++){
            if(a[i] != 0){
                g ++;
            }
        }
        return g;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n; i ++){
            a[i] = sc.nextInt();
        }
        int g = get_unique_count(a,n);
        System.out.println(g);
    }
}
