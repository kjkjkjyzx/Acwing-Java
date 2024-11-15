import java.util.Scanner;
public class Acwing768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = sc.nextLine();
        int n = Math.min(s.length(), r.length());
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            char c1 = s.toLowerCase().charAt(i);//toLowerCase():将大写字母转化为小写字母；
            char c2 = r.toLowerCase().charAt(i);//toUpperCase():将小写字母转化为大写字母；
            if(c1 > c2){
                System.out.println(">");
                flag = true;
                break;
            }else if(c1 < c2){
                System.out.println("<");
                flag = true;
                break;
            }
        }
        if(!flag){
            if(s.length() > r.length()){
                System.out.println(">");
            }else if(s.length() < r.length()){
                System.out.println("<");
            }else{
                System.out.println("=");
            }
        }
    }
}
