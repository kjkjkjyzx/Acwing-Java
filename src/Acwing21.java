import java.util.Scanner;
public class Acwing21 {
    public int Fibonacci(int n) {
        if (n <= 1) return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Acwing21 a = new Acwing21();
        System.out.println(a.Fibonacci(n));
    }
}
