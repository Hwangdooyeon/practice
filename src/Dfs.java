import java.util.*;

public class Dfs {
    static int [] visits;
    static int cnt = 1;


    private static void dfs(int start, LinkedList<Integer>[] adjlist){
        System.out.print(start);
        visits[start] = 1;

        for (int next : adjlist[start]){
            if (visits[next]==0){
                dfs(next, adjlist);
            }
        }
    }
    public static  void bfs_list(int R, LinkedList<Integer>[] adjlist, boolean[] visited){
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[R] =  true;
        queue.add(R);

        while (queue.size() != 0){
            R = queue.poll();
            System.out.print( R+" ");

            Iterator<Integer> iter = adjlist[R].listIterator();
            while (iter.hasNext()){
                int w = iter.next();
                if (!visited[w]){
                    visited[w] = true;
                    queue.add(w);
                }
            }
        }
    }
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();


        boolean visted[] = new boolean[N+1];

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
        System.out.println();
        bfs_list(R, adjlist, visted);
    }
}
