import java.util.Scanner;
public class Acwing763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String m = sc.next();
            String n = sc.next();
            if(m.equals("Hunter") && n.equals("Bear")){
                System.out.println("Player2");
            }else if(m.equals("Hunter") && n.equals("Gun")){
                System.out.println("Player1");
            }else if(m.equals("Bear") && n.equals("Hunter")){
                System.out.println("Player1");
            }else if(m.equals("Bear") && n.equals("Gun")){
                System.out.println("Player2");
            }else if(m.equals("Gun") && n.equals("Hunter")){
                System.out.println("Player2");
            }else if(m.equals("Gun") && n.equals("Bear")){
                System.out.println("Player1");
            }else{
                System.out.println("Tie");
            }
        }
    }
}
