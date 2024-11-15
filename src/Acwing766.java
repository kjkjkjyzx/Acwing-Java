import java.util.Scanner;
public class Acwing766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();//创建一个可以修改的字符串（括号里为空，则字符串暂时为空）；
        int k = s.length();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length() ; i++) {
            char c = s.charAt(i - 1);
            char d = s.charAt(i);
            if (c == ' ' && d == ' ') {
                continue;
            }else{
                sb.append(d);//如果要在sb后增加元素，则需要使用sppwnd();
            }//如果要修改sb的元素，则需要使用setCharAt(p,c),p为要修改的位置，c为要修改成的字符；
        }
        System.out.println(sb);
    }
}
