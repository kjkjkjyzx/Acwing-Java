import java.util.*;
public class Acwing828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();//定义一个栈，栈名为stack；
        int m = sc.nextInt();//输入操作次数；
        while (m-- > 0) {//经过m此循环；
            String option = sc.next();//输入操作；
            if (option.equals("push")) {//给栈顶压入元素；
                int x = sc.nextInt();
                stack.push(x);
            }else if(option.equals("pop")) {//弹出栈顶元素并返回栈顶元素；
                stack.pop();
            }else if(option.equals("empty")) {//判断栈顶是否为空；
                if(stack.empty())
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }else if(option.equals("query")) {//查询栈顶元素；
                System.out.println(stack.peek());
            }
        }
    }
}
