import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2164 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    Queue<Integer> que = new LinkedList<>();

        int n = sc.nextInt();

        for (int i=1; i<=n; i++){

            que.offer(i);
        }
        while (que.size()>1){

            que.poll();
            que.offer(que.poll());
        }
        System.out.println(que.poll());
    }
}
