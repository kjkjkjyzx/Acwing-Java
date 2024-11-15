import java.util.Scanner;
public class Acwing764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char d = s.charAt(i + 1);
            char e = (char)(c + d);
            sb.append(e);
        }
        char c = s.charAt(s.length() - 1);
        char d = s.charAt(0);
        char e = (char)(c + d);
        sb.append(e);
        System.out.println(sb);
    }
}
