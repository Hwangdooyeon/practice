import java.time.Year;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2178 {
    final static Scanner sc = new Scanner(System.in);
    static boolean[][] visted;
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] miro = new int[N][M];
        int miro1= 1;

        boolean visited[] = new boolean[N+1];

        for (int i=0; i<miro.length; i++){
            for (int j=0; j<miro[i].length; j++){
                miro[i][j] = miro1;

            }
        }
        for (int i=0; i<miro.length; i++){
            for (int j=0; j<miro[i].length; j++){

            }
        }
    }
    public static void bfs(int v, boolean[] visited){
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[v]=true;
        queue.add(v);

    }
}
