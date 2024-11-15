import java.util.Scanner;
public class Acwing770 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String x = sc.nextLine();
        String y = sc.nextLine();
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(x)) {
                words[i] = y;
            }
        }
        for (String word : words) {
            System.out.printf("%s ", word);
        }
    }
}
