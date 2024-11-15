import java.util.Scanner;
public class Acwing767 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            char d = (char)(c + 1);//如果直接使得char d = c + 1,就会报错；一定要先进行强制类型转换，才能重新赋值；
            if (c >= 'A' && c <= 'Y') {
                sb.setCharAt(i, d);
            }else if (c >= 'a' && c <= 'y') {
                sb.setCharAt(i, d);
            }else if(c == 'z') {
                sb.setCharAt(i, 'a');
            }else if(c == 'Z') {
                sb.setCharAt(i, 'A');
            }
        }
        System.out.println(sb);
    }
}
