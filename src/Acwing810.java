import java.util.Scanner;
public class Acwing810 {
    private static int abs(int x){
        if(x<0) return -x;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(abs(x));
    }
}
