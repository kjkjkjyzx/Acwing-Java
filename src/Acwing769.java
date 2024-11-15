import java.util.Scanner;
public class Acwing769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder(s);//StringBuilder():创建一个可以被修改的字符串（String不可被修改）；
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
               sb.setCharAt(i, '#');
            }
        }
        System.out.println(sb);
    }
}
