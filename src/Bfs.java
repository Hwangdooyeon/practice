import java.util.*;

public class Bfs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        boolean visited[] = new boolean[n+1];
        LinkedList<Integer>[] adjlist = new LinkedList[n+1];

        for (int i=0; i<=n; i++){
            adjlist[i] = new LinkedList<Integer>();
        }
        for (int i=0; i<m; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adjlist[v1].add(v2);
            adjlist[v2].add(v1);
        }
        for (int i=0; i<=n; i++){

            Collections.sort(adjlist[i]);

        }
        System.out.println("BFS-인접리스트");
        bfs_list(v, adjlist, visited);
    }
    public static void bfs_list(int v, LinkedList<Integer>[] adjlist, boolean[] visited){
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[v] = true;
        queue.add(v);

        while (queue.size()!=0){
              v = queue.poll();
              System.out.println(v + " ");

              Iterator<Integer> iter = adjlist[v].listIterator();
              while (iter.hasNext()){
                  int w = iter.next();
                  if (!visited[w]){
                      visited[w] = true;
                      queue.add(w);
                  }
              }
        }
    }
}
