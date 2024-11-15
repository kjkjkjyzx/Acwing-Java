import java.util.Scanner;
public class Acwing725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n -- > 0) {
            int x = sc.nextInt();
            int sum = 1;
            for(int i = 2; i <= Math.sqrt(x); i++) {
                if(x % i == 0) {
                    if(x == i * i){
                        sum = sum + i;
                    }else{
                        sum = sum + i + x / i;
                    }

                }
            }
            if(x == 1)
                System.out.println("1 is not perfect");
            else{
                if(sum == x) {
                    System.out.println(x + " is perfect");
                }else{
                    System.out.println(x + " is not perfect");
                }
            }

        }
    }
}
