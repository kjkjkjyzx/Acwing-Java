import java.util.Scanner;
public class Acwing807 {
    private static int sum(int l, int r){
        int sum = 0;
        for(int i=l; i<=r; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(sum(l,r));
    }
}
