public class Main {
    public static void main(String[] args) {


        Position pos = new Position("chleb", 3, 1.5);
        System.out.println(pos);
        Position pos1 = new Position("cukier", 4, 3.5);
        System.out.println(pos1);

        Order z = new Order(20);
        z.addPosition(pos);
        z.addPosition(pos1);
        System.out.println(z);


    }

}
