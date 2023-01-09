
import java.util.*;
public class Pyramidclass {
        static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();

            for(int h=0; h<n; h++){
                for(int w=0; w< -1*h + n-1; w++){   // 공백을 찍기위한 반복문
                    System.out.print(" ");
                }

                for(int w=0; w< 2*h +1; w++){   // *을 찍기위한 반복문
                    System.out.print("*");
                }

                System.out.print("\n");
            }
        }
    }

