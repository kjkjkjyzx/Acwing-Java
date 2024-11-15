import java.util.Scanner;
public class Acwing776 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder rb = new StringBuilder(r);
        boolean flag = false;

        if(sb.length() >= rb.length()) {
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(sb.length()-1);
                for(int j = sb.length() - 2; j >= 0; j--) {
                    sb.setCharAt(j + 1,sb.charAt(j));
                }
                sb.setCharAt(0,c);

                int f = sb.indexOf(r);
                if(f != -1) {
                    System.out.println("true");
                    flag = true;
                    break;
                }

                //System.out.println(sb.toString());
            }
        }else{
            for (int i = 0; i < rb.length(); i++) {
                char c = rb.charAt(rb.length()-1);
                for(int j = rb.length() - 2; j >= 0; j--) {
                    rb.setCharAt(j + 1,rb.charAt(j));
                }
                rb.setCharAt(0,c);

                int f = rb.indexOf(s);
                if(f != -1) {
                    System.out.println("true");
                    flag = true;
                    break;
                }

                //System.out.println(sb.toString());
            }
        }
        /*for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(sb.length()-1);
            for(int j = sb.length() - 2; j >= 0; j--) {
                sb.setCharAt(j + 1,sb.charAt(j));
            }
            sb.setCharAt(0,c);

            int f = sb.indexOf(r);
            if(f != -1) {
                System.out.println("true");
                flag = true;
                break;
            }

            //System.out.println(sb.toString());
        }*/


        if(!flag) {
            System.out.println("false");
        }

    }
}
