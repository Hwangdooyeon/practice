import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon_haseset10816 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            int su = sc.nextInt();
            if (map.containsKey(su)){
                map.put(su,map.get(su)+1);
            }
            else {
                map.put(su,1);
            }
        }
        int m = sc.nextInt();
        for (int i=0; i<m; i++){
            int su = sc.nextInt();
            if (map.containsKey(su)){
                System.out.println(map.get(su) + " ");
            }
            else {
                System.out.println("0");
            }
        }
    }
}
