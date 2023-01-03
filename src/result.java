class Calculator {
    int vaule = 0;

    public Calculator() {
        this.vaule = 0;
    }
}
class MaxLimitCalculator extends Calculator {
    void sleep() {
        System.out.println(this.vaule);
    }

    public void add(int val) {
        this.vaule += val;
        if (vaule>100){
            System.out.println("Overflow");
        }

    }
}
public class result{
    public static void main(String[] args){
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);
        cal.add(60);

        System.out.println(cal.vaule);
    }
}





//MaxLimitCalculator cal = new MaxlimitCalculator();
//                 cal.add(50);
//                 cal.add(60);
//