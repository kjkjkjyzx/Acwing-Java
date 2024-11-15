import java.util.*;
public class Acwing829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();//声明了一个将保存 `Integer` 类型元素的队列；
        while(m -- > 0){
            String op = sc.next();//输入操作；
            if(op.equals("push")){
                System.out.println("请输入需要压入的元素：");
                int x = sc.nextInt();
                q.add(x);//添加元素；
            }else if(op.equals("pop")){
                q.remove();//弹出并删除对头元素；
                System.out.println("弹出队头元素成功！");
            }else if(op.equals("empty")){
                System.out.println("判断是否为空：");
                if(q.isEmpty()){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else if(op.equals("query")){
                System.out.println("队头元素为" + q.peek());//弹出对头元素；
            }
        }
    }
}
