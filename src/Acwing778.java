import java.util.Scanner;
public class Acwing778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o = sc.nextLine();
        String[] r = o.split(",");
        String s = r[0];
        String s1 = r[1];
        String s2 = r[2];

        int a = s.indexOf(s1);
        int b = s.lastIndexOf(s2);

        if(a == -1 || b == -1){
            System.out.println(-1);
        }else if(b - a - s1.length() < 0){
            System.out.println(-1);
        }else{
            System.out.println(b - a - s1.length());
        }
    }
}


