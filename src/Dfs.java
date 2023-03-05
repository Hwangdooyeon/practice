import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Dfs {
    static int [] visits;
    static int cnt = 1;

    private static void dfs(int start, LinkedList<Integer>[] adjlist){
        visits[start] = cnt;
        cnt += 1;

        for (int next : adjlist[start]){
            if (visits[next]==0){
                dfs(next, adjlist);
            }
        }
    }
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        visits = new int[N+1];

        LinkedList<Integer>[] adjlist = new LinkedList[N+1];
        for (int i=0; i<=N; i++){
            adjlist[i] = new LinkedList<>();
        }
        for (int i=0; i<M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjlist[u].add(v);
            adjlist[v].add(u);
        }
        for (int i=0; i<=N; i++){
            Collections.sort(adjlist[i]);
        }
        dfs(R, adjlist);
        for (int u=1; u<=N; u++){
            System.out.print(visits[u]+ " ");
        }
    }
}
