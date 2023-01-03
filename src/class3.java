import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class class3 {
    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<Integer>> number = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pc\\Desktop/score.txt"));

        int cnt = 0;

        while (true) {


            if (cnt == 1) {
                continue;
            }
            cnt++;

            String line = br.readLine();

            if (line == null) break;

            String[] token = line.split(",");

            String name = token[0];
            int lan = Integer.parseInt(token[1]);
            int mat = Integer.parseInt(token[2]);
            int eng = Integer.parseInt(token[3]);


            number.put("권지원", new ArrayList<Integer>(List.of(lan, mat, eng)));
            System.out.println(number);

        }
        br.close();
    }
}
