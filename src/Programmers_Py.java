public class Programmers_Py {


    class Solution {
        boolean solution(String s) {
            s = s.toLowerCase();
            int count = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == 'p')
                    count++;
                else if (s.charAt(i) == 'y')
                    count--;
            }

            if (count == 0)
                return true;
            else
                return false;
        }
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();

        int ps = s.length() -  s.replace("p", "").length();
        int ys = s.length() -  s.replace("y", "").length();

        return  ps == ys;

    }
}
