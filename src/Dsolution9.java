import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dsolution9 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        String[] TT = {"딸기","포도","참외","수박","사과","회사","학원","학교","유치원","보육원","부침개","매운탕","낙지","새우","삼겹살","도마","칼","프라이팬","뒤집개","국자","대한민국","미국","일본","러시아","인도"};
        Scanner text = new Scanner(System.in);
        System.out.println("단어들을 입력해주세요");


        for (int i = 0; i < TT.length; i++) {


            TT[i] = text.nextLine();
        }
                for (int i=0; i< arr.length; i++  )
                    System.out.println(TT[i]);
            }

        }
