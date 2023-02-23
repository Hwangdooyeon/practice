import java.util.*;

public class Baekjoon10974 {
    static final Scanner sc = new Scanner(System.in);
    static boolean[] used = new boolean[9];

    private static void process(int N, int depth, ArrayList<Integer> answer){
        if(depth == N){
            for(int x=0; x<N; x++){
                System.out.print(answer.get(x) + " ");
            }
            System.out.println();
            return;
        }

        for(int x=1; x<=N; x++){
            if(!used[x]){
                answer.set(depth, x);
                used[x] = true;
                process(N, depth+1, answer);
                used[x] = false;
                answer.set(depth, 0);
            }
        }
    }

    public static void main(String[] args) {
        int N = sc.nextInt();
        ArrayList<Integer> answer = new ArrayList<>(Collections.nCopies(8, 0));
        process(N, 0, answer);
    }
}