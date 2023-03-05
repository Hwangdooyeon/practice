public class Floyd {
    public static void print(int[][] graph){
        for (int i=1; i< graph.length; i++){
            for (int j=1; j< graph.length; j++){
                if (graph[i][j]==999_999_999)
                System.out.println("INF ");
                else
                    System.out.println(graph[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void putEdge(int[][] graph, int x, int y, int edge){
        graph[x][y] = edge;
        graph[y][x] = edge;
    }
    public static void main(String[] args){
        int n=5;
        int[][] graph = new int[n+1][n+1];

        putEdge(graph, 1,2,9);
        putEdge(graph, 1,3,2);
        putEdge(graph, 1,4,4);
        putEdge(graph, 2,3,5);
        putEdge(graph, 2,5,7);
        putEdge(graph, 3,4,1);
        putEdge(graph, 4,5,8);

        System.out.println("주어진 그래프 모양");
        print(graph);
        System.out.println();

        int[][] floyd = new int[n+1][n+1];
        for (int i=1; i <graph.length; i++){
            for (int j=1; j< graph.length; j++){
                if (i==j)
                    floyd[i][j]=0;
                else
                    floyd[i][j]= 999_999_999;
            }
        }
        putEdge(graph, 1,2,9);
        putEdge(graph, 1,3,2);
        putEdge(graph, 1,4,4);
        putEdge(graph, 2,3,5);
        putEdge(graph, 2,5,7);
        putEdge(graph, 3,4,1);
        putEdge(graph, 4,5,8);

        for(int i=1; i< floyd.length; i++){
            for(int j=1; j<floyd.length; j++){
                for (int k=1; k< floyd.length; k++){

                    floyd[j][k] = Math.min(floyd[j][k], floyd[j][i] + floyd[i][k]);
                }
            }
        }
    }
}
