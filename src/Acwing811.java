import java.util.Scanner;
public class Acwing811 {
    private static void swap(int[] a){
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        swap(a);
        System.out.println(a[0] + " " + a[1]);
    }
}
