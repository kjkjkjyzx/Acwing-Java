import java.util.*;
public class Acwing816 {
    private static void reverse(int[] a, int size){
        for(int i = size - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        for(int i = size; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = sc.nextInt();
        int[] a= new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        reverse(a,size);
    }
}
