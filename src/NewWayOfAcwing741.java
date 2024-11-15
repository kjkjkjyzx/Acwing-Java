import java.util.Scanner;
public class NewWayOfAcwing741 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                //t --;
                int n = sc.nextInt();
                int[] Fib = new int[n+1];
                Fib[0] = 0;//如果在此为Fib[1]赋值，那么当n = 0时，会出现数字越界；
                if(n == 0){
                    Fib[0] = 0;
                }else if(n == 1){
                    Fib[1] = 1;
                }else if(n >= 2){
                    Fib[1] = 1;
                    for(int i = 2; i <= n; i++){
                        Fib[i] = Fib[i-1] + Fib[i-2];
                    }
                }
                System.out.println("Fib(" + n + ") = " + Fib[n]);
            }
        }
    }
