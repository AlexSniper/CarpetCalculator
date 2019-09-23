package alex.leaernprogramming;

public class Main {

    public static void main(String[] args) {
Carpet carpet =new Carpet(5);
Floor floor=new Floor(3,4);
Calculator calculator=new Calculator(floor,carpet);
        System.out.println("Total = " +calculator.getTotalCost());
        carpet=new Carpet(1.5);
        floor =new Floor(5.4,4.5);
        calculator =new Calculator(floor ,carpet);
        System.out.println("total = " +calculator.getTotalCost());
    }
}
