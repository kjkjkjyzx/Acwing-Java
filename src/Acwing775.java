import java.util.Scanner;
public class Acwing775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] t = s.split(" ");
        int n = t.length;
        for (int i = 0; i < t.length; i++) {
            System.out.printf("%s ",t[n- i - 1]);
        }
    }
}
