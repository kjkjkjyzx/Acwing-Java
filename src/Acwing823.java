import java.io.*;
import java.util.*;
public class Acwing823 {
    private static int[] path;//定义一个数组作为仓库，存储当前排列路径；
    private static boolean[] st;//一个布尔仓库选择，st[i]表示元素i是否已经在当前的排列中使用过（避免重复）；
    private static int n;
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //使用BufferedWriter高效进行的输出操作，可以避免System.out.println()间隙调用导致的性能问题；

    private static void DFS(int u) throws IOException {
        if(u == n){
            for(int i = 0; i < n; i++){
                bw.write(path[i] + 1  + " ");
            }
            bw.write("\n");
        }else{
            for(int i = 0; i < n; i++){
                if(!st[i]){
                    path[u] = i;//如果没有被使用过，则使用它；
                    st[i] = true;
                    DFS(u+1);//进入下一层；
                    st[i] = false;//恢复现场；
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        path = new int[n];
        st = new boolean[n];//初始值默认为false；
        DFS(0);//调用DFS(0),从排列的第0位置开始生成排列；
        bw.flush();//将缓冲区中的内容立即写入输出流；
    }//因为 BufferedWriter 使用缓冲机制，它会将数据暂时存储在内存中的缓冲区里，
    // 而不是立即写到目标位置（如文件或控制台）。flush() 强制将缓冲区的数据写出，以确保所有数据都被处理
}
