import java.util.Scanner;
public class Acwing777 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if(s.charAt(0) == '.')
                break;
            StringBuilder t = new StringBuilder();
            int n = 0;
            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                n = 0;
                t.append(s.charAt(i));
                int l = t.length();
                for(int j = 0; j < s.length(); j = j + l) {
                    if (j + l <= s.length() && s.substring(j, j + l).equals(t.toString())) {
                        n++;//注意，这里不能把j + l <= s.length() && s.substring(j, j + l).equals(t.toString())中的两部分调换位置；
                    }
                }
                if(n * l == s.length()){
                    flag = true;
                    break;
                }
            }
            if (flag) {
                //System.out.println(t);
                System.out.println(n);
            } else {
                System.out.println(s);
                //System.out.println(1);
            }
        }
    }
}

