import java.util.Scanner;

public class Baekjoon2805 {
    final static Scanner sc = new Scanner(System.in);
    static int n;
    static int m;
    public static int Bsearch(int[] tree, int m) {


        int left = 0;
        int right = tree.length-1;
        int mid = (left + right) /2;

        while (left<=right){
            int sum = 0;
            for (int i=0; i<n; i++){

                if (tree[i]-mid>0){
                    sum += tree[i] - mid;
                }
            }
            if (sum<m){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
            mid=(left+right)/2;
        }
        return mid;
    }


    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();

        int [] tree = new int[n];

        for (int i=0; i<n; i++){

            tree[i] = sc.nextInt();
        }
        int answer = Bsearch(tree, m);
        System.out.println(answer);
    }
}
//    private static int Bsearch(int[] arr, int M) {
//        int left = 0;
//        int right = arr.length - 1;
//        int mid = left + right / 2;
//
//        while (left <= right) {
//            if (arr[mid] == M) {
//                return 1;
//            } else if (arr[mid] < M) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//            mid = (left + right) / 2;
//        }
//        return 0;
//    }
