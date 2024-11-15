import java.util.Scanner;
public class Acwing771 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            n --;
            String s = sc.next();
            int num = 1;
            int max = 0;
            char c = 'a';
            for (int i = 0; i < s.length() - 1; i++) {
                if(s.charAt(i) == s.charAt(i+1)) {
                    num++;
                }else{
                    if(num > max){
                        max = num;
                        c = s.charAt(i);
                    }
                    num = 1;
                    continue;
                }
            }
            //if(s.length() > 1 && s.charAt(s.length() - 1) == s.charAt(s.length()-2)){
                if(num > max){
                    max = num;
                    c = s.charAt(s.length()-1);
                }
           // }
            System.out.printf("%c ",c);
            System.out.println(max);
        }
    }
}