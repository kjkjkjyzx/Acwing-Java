import java.util.Scanner;
public class Acwing772 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] r = new int[26];
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                int n= c - 'a';
                r[n] ++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (r[s.charAt(i) - 'a'] == 1) {
                System.out.println(s.charAt(i));//charAt(i):字符串的第i个元素；
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("no");
        }
    }
}
