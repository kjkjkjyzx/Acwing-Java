import java.util.Scanner;
public class Acwing762 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        String s = sc.next();//next()在遇到空格和换行时会结束输入；
        String t = sc.next();//nextLine（）在遇到换行符时会结束输入，但是可以输入空格（即“nextLine”是输入整行的字符串）；
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                num ++;
        }
        double b = (num * 1.0 ) / s.length();
        if(b >= k)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
