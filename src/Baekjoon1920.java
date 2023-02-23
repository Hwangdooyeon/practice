import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Baekjoon1920 {
    static int bsearch(ArrayList<Integer> listA, int M) {

        int left = 0, right = listA.size() - 1, mid = (left + right) / 2;
        int answer = -1;
        while (left <= right) {
            if (M < listA.get(mid)) {
                right = mid - 1;
            } else if (M > listA.get(mid)) {
                left = mid + 1;

            } else {
                answer = mid;
                break;
            }
            mid = (left + right) / 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int N = sc.nextInt();
           int targetnumber = 0;
           int [] arr = new int[N];
           for (int i=0; i<N; i++){

               arr[i] = sc.nextInt();
           }
        Arrays.sort(arr);

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i=0; i<M; i++){

            arr2[i] = sc.nextInt();

            }
        }
    }





        ////int M = sc.nextInt();
//        int arr2[] = new int[M];
//        for (int u=0; u<M; u++){
//
//            arr2[u]=sc.nextInt();




//public class Baekjoon1920 {
//    int Search(ArrayList<Integer> listA,int M){
//        int left = 0, right =listA.size()-1, mid =(left + right)/2;
//        int answer = -1;
//
//        while (left <= right){
//            if(M < listA.get(mid)){
//                right = mid -1;
//            }else if (M>listA.get(mid)){
//                left = mid+1;
//
//            }else{
//                answer = mid;
//                break;
//            }
//            mid = (left + right) / 2;
//        }
//        return answer;
//    }














    //public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int testcase = sc.nextInt();
//        int arr[] = new int[testcase];
//        for (int i=0; i<arr.length; i++){
//
//               arr[i]=sc.nextInt();
//        }
//
//    }
//}

// ArrayList<Integer> array1 = new ArrayList<>();
//
//        int N = sc.nextInt();
//
//        for (int i = 0; i < N; i++) {
//            array1.add(sc.nextInt());
//
//        }
//
//        Collections.sort(array1);
//
//        ArrayList<Integer> array2 = new ArrayList<>();
//        int M = sc.nextInt();
//
//        for (int u = 0; u < M; u++) {
//
//            array2.add(sc.nextInt());
//
//            for (int i = 0; i < M; i++) {
//
//                if (array2 == array1) {
//
//                    System.out.println("1");
//                } else {
//                    System.out.println("0");
//                }
//            }