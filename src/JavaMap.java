import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class JavaMap {
    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<Integer> > number = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pc\\Desktop/score.txt"));
        number.put("권지원", new ArrayList<Integer>(List.of(80,100,100)));
        int cnt=0;
        while (true){
             cnt++;
            if (cnt==1){
                continue;
            }

            String line = br.readLine();

            if(line==null)break;

            StringTokenizer reader = new StringTokenizer(line,", ");

            while(reader.hasMoreTokens()){
                System.out.println(reader.nextToken());
            }

        }
        br.close();

    }
}
//StringTokenizer stk=new StringTokenizer(str,"-=");
        /*
        Scanner sc = new Scanner(System.in);
        HashMap< String,Integer > students = new HashMap<>();
        students.put("권지원",80);
        */



//이름, 언어, 수학, 영어
        //권지원, 80, 100, 100
        //이동진, 100, 100, 100
        //카리나, 0, 60, 20
        //윈터, 50, 20, 30