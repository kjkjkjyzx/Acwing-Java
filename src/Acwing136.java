import java.io.*;
import java.util.*;

public class Acwing136 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //InputStreamReader(System.in): 将字节流 System.in（代表标准输入，即键盘输入）转换为字符流。
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //OutputStreamWriter(System.out): 将字节流 System.out（代表标准输出，即控制台）转换为字符流。

        //创建了用于输入和输出的 BufferedReader 和 BufferedWriter 对象，
        //帮助处理来自控制台的输入和输出，适合需要处理大量数据时提高性能。


        int n = Integer.parseInt(br.readLine());//输入序列A的长度；
        int[] a = new int[n];//定义序列A;
        String[] str = br.readLine().split(" ");//读入数据，并根据空格分开；
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);//将读入的数据存入序列A；
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(a[0],0);//定义一个TreeMap并将序列A的第一个元素压入；

        for (int i = 1; i < n; i++) {
            int b =Integer.MAX_VALUE, p = 0;
            Map.Entry<Integer, Integer> up = map.ceilingEntry(a[i]);//找到比a[i]大的元素的最小值；
            Map.Entry<Integer, Integer> down = map.floorEntry(a[i]);//找到比a[i]小的元素的最大值；
            if (up != null){
                b = up.getKey() - a[i];
                p = up.getValue();
            }
            if (down != null && a[i] - down.getKey() <= b){
                b = a[i] - down.getKey();
                p = down.getValue();
            }
            bw.write(b + " " + (p + 1) + "\n");
            map.put(a[i],i);//将序列A的第i+1个元素压入Map;
        }
        bw.flush();
    }
}
