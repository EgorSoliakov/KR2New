package Model;

public class Toy {

    private String name;
    private int drop;
    private int quantity;

    public Toy(String name, int drop, int quantity) {
        this.name = name;
        this.drop = drop;
        this.quantity = quantity;
    }

    public int getQuantity(){
        if (quantity < 0){
            return 0;
        }
        return quantity;
    }
    public String getName() {
        return name;
    }
    public int getDrop() {
        return drop;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Drop: " + drop + ", quantity: " + quantity;
    }
}
