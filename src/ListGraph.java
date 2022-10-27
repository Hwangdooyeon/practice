import java.util.ArrayList;
import java.util.Scanner;

class ListGraph {
    private ArrayList<ArrayList<Integer>> listGraph;

    public ListGraph(int initsize){
        this.listGraph = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<initsize+1; i++){
            listGraph.add(new ArrayList<Integer>());

        }
    }
    public ArrayList<ArrayList<Integer>> getGraph(){

        return this.listGraph;
    }
    public ArrayList<Integer> getNode(int i){

        return this.listGraph.get(i);
    }
    public void put(int x, int y){
        listGraph.get(x).add(y);
        listGraph.get(y).add(x);
    }
    public void putSingle(int x, int y) {
        listGraph.get(x).add(y);
    }
    public void printGraphToAdjlist(){
        for (int i=1; i<listGraph.size(); i++){
            System.out.print("Node"+i+"adjlist");

            for (int j=0; j<listGraph.get(i).size(); j++){
                System.out.print("->"+ listGraph.get(i).get(j));
            }
            System.out.println();
        }
    }
}
class GraphPratice{
    public static void main(String[] args){
        int initSize = 5;
        ListGraph adjlist = new ListGraph(initSize);


        adjlist.putSingle(1,2);
        adjlist.putSingle(2,1);
        adjlist.putSingle(2,5);
        adjlist.putSingle(3,4);
        adjlist.putSingle(4,1);
        adjlist.putSingle(5,3);
        adjlist.printGraphToAdjlist();

    }
}
