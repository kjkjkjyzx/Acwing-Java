import java.util.Scanner;
public class Acwing774 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = s.replace('.',' ');//repalca():替换字符
        String[] r = t.split(" ");//split():分割字符串
        String s1 = r[0];
        for (int i = 0; i < r.length - 1; i++) {
            int a = r[i].length();
            int b = r[i + 1].length();
            if(a < b) {
                s1 = r[i + 1];
            }
            //System.out.println(a);
            //System.out.println(b);
        }
        System.out.println(s1);
    }
}
