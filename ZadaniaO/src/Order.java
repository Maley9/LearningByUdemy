import java.util.Arrays;

public class Order  {

    String[] items;
    int ItemPlus;
    double maxWeight;

    public Order() {
    }

    public Order(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addPosition(Order p){


    }
    public double calcCost(){
        return ItemPlus++;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + Arrays.toString(items) +
                ", ItemPlus=" + ItemPlus +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
