import java.io.*;

public class Baekjoon2920string {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = bf.readLine();

        if (n.equals("1 2 3 4 5 6 7 8")){
            bw.write("ascending");
        }
        else if (n.equals("8 7 6 5 4 3 2 1")) {
            bw.write("descending");
        }
        else{
            bw.write("mixed");
        }
        bw.flush();
    }
}
