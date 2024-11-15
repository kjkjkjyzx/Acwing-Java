import java.util.Scanner;
public class NewWayOfAcwing779 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (sc.hasNext()) {
            n = sc.nextInt();
            if(n == 0)
                break;
            StringBuilder str = new StringBuilder();//创建可变（可修改）字符串；
            StringBuilder[] arrs = new StringBuilder[n];//创建可变（可修改）字符数组，长度为n；
            int l = 201;

            for (int i = 0; i < n; i++) {
                String s = sc.next();
                if(s.length() < l)
                    l = s.length();//找到长度最短的字符串；
                arrs[i] = new StringBuilder(s).reverse();//创建可变（可修改）字符串，并将其翻转；
            }

            boolean flag;
            for (int j = 0; j < l; j ++) {
                flag = true;
                for(int i = 1; i < n; i ++){
                    if (arrs[i].charAt(j) != arrs[0].charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(!flag)
                    break;
                str.append(arrs[0].charAt(j));
            }

            System.out.println(str.reverse());
        }

    }
}
