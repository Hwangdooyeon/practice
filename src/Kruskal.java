import java.util.Arrays;
import java.util.Comparator;

public class Kruskal {
    public static void union(int[] parent, int a, int b){
        int a_parent = find(parent, a);
        int b_parent = find(parent, b);

        if (a_parent<b_parent)
             parent[b_parent] = a_parent;
        else
            parent[a_parent] = b_parent;
        }
        public static int find(int[] parent, int i){

        if (parent[i]==i)
            return i;
        return find(parent, parent[i]);
        }
        public static void main(String[] args){
        int [][] graph = {new int[]{1,2,6},{1,3,3},{1,4,1},{2,5,4},{3,4,2},{3,5,5},{4,5,7}};
        int []parent = new int[6];
        int total = 0;

        for (int i=0; i<parent.length; i++){
            parent[i] = i;
        }
            Arrays.sort(graph, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return 0;
                }
            });
        for (int i=0; i<graph.length; i++){
           if (find(parent,graph[i][0]) != find(parent, graph[i][1])){
               total += graph[i][2];
               union(parent,graph[i][0], graph[i][1]);
            }
        }
        System.out.println("최소 비용 신장 트리 가중치의 합은" + total);
    }
}

