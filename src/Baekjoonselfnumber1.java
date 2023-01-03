public class Baekjoonselfnumber1 {
    public static int notselfnumber (int i){
        int sum = i;

        while (i != 0){
            sum = sum + (i % 10);
            i = i / 10;
        }
        return  sum;
    }
    public static void main (String[] args){

        boolean[] selfnumber = new boolean[10001];

        for (int i=1; i<10001; i++){
            int N = notselfnumber(i);

            if(N <= 10000)
                selfnumber[N]= true;
        }

        for (int u=1; u<10001; u++){
            if (!selfnumber[u])
                System.out.println(u);
            }
        }
    }

