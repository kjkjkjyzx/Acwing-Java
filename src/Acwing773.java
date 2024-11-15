import java.util.Scanner;
public class Acwing773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String r = sc.next();
            char max = s.charAt(0);
            int place = 0;
            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c > max) {
                    max = c;
                    place = i;
                }
            }
            String s1 = s.substring(0 , place + 1);//sbustring（a,b):返回[a,b)中的字串；
            String s2 = s.substring(place + 1);
            System.out.println(s1 + r + s2);
        }
    }
}
