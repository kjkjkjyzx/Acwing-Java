import java.util.Scanner;
public class Acwing821 {
    private static int step(int n){
        int a = n / 2 + n % 2;//最多步为n,最少步是a；
        int k = 0;
        int sum = 0;
        int l = 1;
        for(int q = n; q >= a; q --){
            l = 1;
            if(k == 0)
                sum += 1;
            else{
                for(int j = 1, i = q; j <= k; j ++, i --){
                    l = l * i / j;
                }
                sum += l;
            }
            k ++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = step(n);
        System.out.println(s);
    }
}
