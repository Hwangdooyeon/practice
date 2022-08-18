import java.util.HashMap;

public class Homework1 {
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<>();
        map.put("A","90");
        map.put("B","80");
        map.put("C","70");
        System.out.println(map.get("B"));
    }
}
