import java.util.Scanner;
public class Acwing16 {
    public String replaceSpaces(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Acwing16 a = new Acwing16();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(a.replaceSpaces(sb));
    }
}
